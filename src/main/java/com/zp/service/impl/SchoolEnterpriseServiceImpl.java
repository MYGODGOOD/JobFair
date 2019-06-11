package com.zp.service.impl;

import com.zp.entity.SchoolEnterprise;
import com.zp.dao.SchoolEnterpriseMapper;
import com.zp.service.SchoolEnterpriseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
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
public class SchoolEnterpriseServiceImpl extends ServiceImpl<SchoolEnterpriseMapper, SchoolEnterprise> implements SchoolEnterpriseService {

    @Autowired
    private SchoolEnterpriseMapper schoolEnterpriseMapper;

    @Override
    public R findSE() {
        return R.setOK("ok",schoolEnterpriseMapper.findSE());
    }
}
