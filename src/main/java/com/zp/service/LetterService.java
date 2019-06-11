package com.zp.service;

import com.zp.entity.Letter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.vo.R;;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface LetterService extends IService<Letter> {

    R findLetterById(int id);

}
