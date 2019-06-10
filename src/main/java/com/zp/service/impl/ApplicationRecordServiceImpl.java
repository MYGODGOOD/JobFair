package com.zp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.ApplicationRecordMapper;
import com.zp.entity.ApplicationRecord;
import com.zp.service.ApplicationRecordService;
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
public class ApplicationRecordServiceImpl extends ServiceImpl<ApplicationRecordMapper, ApplicationRecord> implements ApplicationRecordService {

    @Autowired
    private ApplicationRecordMapper applicationRecordMapper;

    @Override
    public R getApplicationRecord(Integer uid) {
        return null;
    }
}
