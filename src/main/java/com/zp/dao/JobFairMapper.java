package com.zp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.entity.JobFair;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
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
public interface JobFairMapper extends BaseMapper<JobFair> {

    public List<JobFair> search(@Param("city") String city, @Param("time") String time, @Param("school") String school);

}
