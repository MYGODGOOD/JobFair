package com.zp.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zp.entity.User;
import com.zp.service.UserService;
import com.zp.vo.R;
import com.zp.vo.Result;
import io.swagger.annotations.Api;
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
@Api(value = "用户操作",tags = "用户操作")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("获取用户的基本信息")
    @GetMapping("/uinfo/{uid}")
    public R getUInfo(@ApiParam("用户id") @PathVariable("uid") Integer uid){
        User uinfo = userService.getById(uid);
        return R.setOK("",uinfo);
    }

    @ApiOperation("修改用户的基本信息")
    @PutMapping("/uinfo")
    public R updateUInfo(User user){
        boolean update = userService.update(user, new UpdateWrapper<User>().eq("uid", user.getUid()));
        return R.setOK("",update);
    }

    @ApiOperation(value = "用户注册",notes = "这是一个实现用户注册的方法，需要参数信息")
    @PostMapping(value = "/register.do")
    @ResponseBody
    public Result register(User user){
        return userService.register(user);
    }
    @ApiOperation(value = "用户登录",notes = "这是一个实现用户登录的方法，需要参数信息")
    @PostMapping(value = "/login.do")
    @ResponseBody
    public Result login(User user){
        return userService.login(user);
    }

}

