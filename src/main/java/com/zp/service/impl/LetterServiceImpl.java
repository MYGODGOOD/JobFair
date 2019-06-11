package com.zp.service.impl;

import com.zp.entity.Letter;
import com.zp.dao.LetterMapper;
import com.zp.service.LetterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import com.zp.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;

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

    @Autowired
    private LetterMapper letterMapper;

    @Override
    public R findLetterById(int id) {
        return R.setOK("ok",letterMapper.findLetterById(id));
    }
}
