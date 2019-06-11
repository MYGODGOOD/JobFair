package com.zp.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.UserMapper;
import com.zp.entity.User;
import com.zp.service.UserService;
import com.zp.vo.R;
import com.zp.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public Result register(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = userMapper.findUserByName(user.getUsername());
            if (existUser != null){
                result.setMsg("用户名已存在");
            }else {
                userMapper.register(user);
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        }catch (Exception e){
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result login(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Integer userUid = userMapper.login(user);
            if (userUid == null){
                result.setMsg("用户名或密码错误");
            }else {
                result.setMsg("登录成功");
                result.setSuccess(true);
                user.setUid(userUid);
                result.setDetail(user);
            }
        }catch (Exception e){
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public R addEmail(User user) {
        return R.setOK();
    }

    @Override
    public Object updatePassword(String password, String newPassword, String username, HttpSession session) {
        Map<String,Object> map = new HashMap<String, Object>();

        if (password != null){
            User user = userMapper.selectByPassword(password, username);
            Integer uid = user.getUid();
            String userPassword = user.getPassword();

            if (userPassword.equals(password)){
                User u = new User();
                u.setUid(uid);
                u.setPassword(newPassword);
                return userMapper.updateByPrimaryKeySelective(u);
            }
        }

        return 0;
    }




    @Override
    public User findUserByUid(Integer uid) {
        return userMapper.findUserByUid(uid);
    }


}
