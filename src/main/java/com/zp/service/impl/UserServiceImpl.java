package com.zp.service.impl;

import com.zp.entity.User;
import com.zp.dao.UserMapper;
import com.zp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import org.springframework.stereotype.Service;

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

}
