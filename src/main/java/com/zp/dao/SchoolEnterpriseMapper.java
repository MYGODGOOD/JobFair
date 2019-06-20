package com.zp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.entity.SchoolEnterprise;
import com.zp.vo.R;
import org.springframework.stereotype.Repository;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */

public interface SchoolEnterpriseMapper extends BaseMapper<SchoolEnterprise> {

    R findSE();

}
