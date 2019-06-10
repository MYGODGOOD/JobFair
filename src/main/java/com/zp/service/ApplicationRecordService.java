package com.zp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.entity.ApplicationRecord;
import com.zp.vo.R;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface ApplicationRecordService extends IService<ApplicationRecord> {
    public R getApplicationRecord(Integer uid);
}
