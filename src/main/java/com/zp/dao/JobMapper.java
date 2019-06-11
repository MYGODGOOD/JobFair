package com.zp.dao;

import com.zp.entity.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.vo.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;;import java.util.Date;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Repository
public interface JobMapper extends BaseMapper<Job> {

    R findFulltimeJob(@Param("hangye") String hangye, @Param("jname") String jname,
                      @Param("pubDate") Date pubDate, @Param("workPlace") String workPlace);
    R findParttimeJob(@Param("hangye") String hangye, @Param("jname") String jname,
                      @Param("pubDate") Date pubDate, @Param("workPlace") String workPlace);

}
