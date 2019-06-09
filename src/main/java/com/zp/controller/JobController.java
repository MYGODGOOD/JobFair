package com.zp.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.zp.entity.Job;
import com.zp.service.JobService;
import com.zp.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Api(value="搜索工作",tags = "搜索工作")
@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @ApiOperation(value = "搜索所有工作",notes = "搜索所有工作")
    @GetMapping("/job.do")
    @CrossOrigin
    public R query(String jname){
        return R.setOK("ok",jobService.getOne(new QueryWrapper().lambda()));

    }

    @ApiOperation(value = "增加工作",notes = "增加工作")
    @PostMapping("/job/save.do")
    public R  add(@RequestBody Job job){
        return R.setOK("ok",jobService.save(job));
    }

}

