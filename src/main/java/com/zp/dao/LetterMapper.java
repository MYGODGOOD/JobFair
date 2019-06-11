package com.zp.dao;

import com.zp.entity.Letter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.vo.R;
import org.springframework.stereotype.Repository;;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Repository
public interface LetterMapper extends BaseMapper<Letter> {

   R findLetterById(int id);

}
