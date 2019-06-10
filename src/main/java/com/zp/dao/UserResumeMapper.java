package com.zp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.entity.UserResume;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Mapper
public interface UserResumeMapper extends BaseMapper<UserResume> {

    /**
     * 修改简历
     * @param userResume
     */
    public void updateResume(UserResume userResume);

}
