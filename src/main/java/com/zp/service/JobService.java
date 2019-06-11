package com.zp.service;

import com.zp.entity.Job;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.vo.R;
import org.apache.ibatis.annotations.Param;;import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface JobService extends IService<Job> {

    R findfindFulltimeJobByCondition(String hangye, String jname, Date pubDate, String workPlace);

    R findfindParttimeJobByCondition(String hangye, String jname, Date pubDate, String workPlace);


}
