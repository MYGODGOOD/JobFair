package com.zp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.entity.User;
import com.zp.vo.Result;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface UserService extends IService<User> {

    Result register(User user);

    Result login(User user);

}
