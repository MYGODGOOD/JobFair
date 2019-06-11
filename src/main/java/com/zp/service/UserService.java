package com.zp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.entity.User;
import com.zp.vo.R;
import com.zp.vo.Result;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service

public interface UserService extends IService<User> {

     Result register(User user);

     Result login(User user);

     R addEmail(User user);

     Object updatePassword(String password, String newPassword, String username, HttpSession session);

     User findUserByUid(Integer uid);

}
