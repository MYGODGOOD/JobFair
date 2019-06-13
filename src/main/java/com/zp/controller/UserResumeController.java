package com.zp.controller;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zp.entity.UserResume;
import com.zp.service.UserResumeService;
import com.zp.vo.R;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@RestController
@RequestMapping("/userResume")
public class UserResumeController {

    @Autowired
    private UserResumeService userResumeService;

    @ApiOperation("获取用户的简介信息")
    @GetMapping("/urinfo/{uid}")
    public R getURInfo(@ApiParam("用户的id") @PathVariable("uid") Integer uid){
        UserResume userResume = userResumeService.getById(uid);
        return R.setOK("",userResume);
    }

    @ApiOperation("修改用户的简介信息")
    @PutMapping("/urinfo")
    public R updateURInfo(@ApiParam(name = "用户简介的实例",value = "用户简介的实例") UserResume userResume){
        Integer uid = userResume.getUid();
        boolean update = userResumeService.update(userResume, new UpdateWrapper<UserResume>()
                .eq("uid",uid));
        return R.setOK("",update);
    }

}

