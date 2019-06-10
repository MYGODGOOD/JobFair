package com.zp.controller;


import com.zp.entity.WorkExperience;
import com.zp.service.WorkExperienceService;
import com.zp.vo.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/workExperience")
public class WorkExperienceController {
    @Autowired
    private WorkExperienceService workExperienceService;

    @ApiOperation("获得用户的所有工作经验")
    @GetMapping("/uworkex?{uid}")
    public R getUserWorkExperience(@PathVariable("uid") Integer uid){
        Map<String, Object> map = new HashMap<>();
        map.put("uid",uid);
        Collection<WorkExperience> list = workExperienceService.listByMap(map);
        return R.setOK("",list);
    }

    @ApiOperation("添加工作经验")
    @PostMapping("/uworkex")
    public R addWorkExpersion(WorkExperience workExperience){
        boolean save = workExperienceService.save(workExperience);
        return R.setOK("",save);
    }

    @ApiOperation("修改工作经验,通过工作经验id")
    @PutMapping("/uworkex")
    public R updateWorkExpersion(WorkExperience workExperience){
        boolean update = workExperienceService.updateById(workExperience);
        return R.setOK("",update);
    }
}

