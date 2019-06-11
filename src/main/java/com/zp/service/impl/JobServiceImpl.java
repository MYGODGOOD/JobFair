package com.zp.service.impl;

import com.zp.entity.Job;
import com.zp.dao.JobMapper;
import com.zp.service.JobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import com.zp.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public R findfindFulltimeJobByCondition(String hangye, String jname, Date pubDate, String workPlace) {

        return R.setOK(null,jobMapper.findFulltimeJob(hangye,jname,pubDate,workPlace));

    }

    @Override
    public R findfindParttimeJobByCondition(String hangye, String jname, Date pubDate, String workPlace) {

        return R.setOK(null,jobMapper.findParttimeJob(hangye,jname,pubDate,workPlace));

    }
}
