package com.zp.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.LetterMapper;
import com.zp.entity.Letter;
import com.zp.service.LetterService;
import com.zp.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LetterMapper letterMapper;

    @Override
    public R getUserLetters(Integer pageNum,Integer pageSize,Integer uid, String key) {
        if (key != null&&!key.equals("undefined")){
            key = "%" + key +"%";
        }else {
            key = null;
        }
        Page page = new Page<>(pageNum, pageSize);
        IPage<Letter> page1 = null;
        try {
            page1= letterMapper.findUserLetters(new Page<Letter>(pageNum, pageSize)
                    , uid, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.setOK("",page1);
    }
}
