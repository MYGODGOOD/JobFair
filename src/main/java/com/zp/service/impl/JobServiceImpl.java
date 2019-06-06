package com.zp.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.JobMapper;
import com.zp.entity.Job;
import com.zp.service.JobService;
import org.springframework.stereotype.Service;

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

}
