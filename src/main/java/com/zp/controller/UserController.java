package com.zp.controller;


import com.zp.entity.User;
import com.zp.service.UserService;
import com.zp.vo.R;
import com.zp.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
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
@Api(value = "用户操作",tags = "用户操作")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


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

    @ApiOperation(value = "添加用户邮箱",notes = "这是一个实现添加用户邮箱的方法，需要参数信息")
    @PostMapping(value = "/addEmail.do")
    @ResponseBody
    public R addEmail(User user){
        return userService.addEmail(user);
    }


    @ApiOperation(value = "修改用户密码",notes = "这是一个实现修改用户密码的方法，需要参数信息")
    @PostMapping(value = "/updatePassword.do")
    @ResponseBody
    public Object updatePassword(String password, String newPassword, String username, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        int i = (int)userService.updatePassword(password, newPassword, username, session);
        if (i == 1){
            map.put("code",1);
            map.put("msg","修改成功");
        }else {
            map.put("code",0);
            map.put("msg","修改失败");
        }
        return map;

    }

    @ApiOperation(value = "查询用户",notes = "这是一个实现查询用户的方法，需要参数信息")
    @PostMapping(value = "/findByUid.do")
    @ResponseBody
    public User findUserByUid(Integer uid){
        User user = userService.findUserByUid(uid);
        return user;
    }



}

