package com.zp.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.LetterMapper;
import com.zp.entity.Letter;
import com.zp.service.LetterService;
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
public class LetterServiceImpl extends ServiceImpl<LetterMapper, Letter> implements LetterService {

}
