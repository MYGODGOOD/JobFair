package com.zp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zp.entity.Letter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Mapper
public interface LetterMapper extends BaseMapper<Letter> {

    public IPage<Letter> findUserLetters(Page<Letter> page, @Param("uid") Integer uid,
                                       @Param("key") String key);
}
