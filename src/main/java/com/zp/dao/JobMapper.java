package com.zp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.entity.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Mapper
public interface JobMapper extends BaseMapper<Job> {

}
