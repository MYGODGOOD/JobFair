package com.zp.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.JobMapper;
import com.zp.entity.Job;
import com.zp.service.JobService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.pkcs11.wrapper.Constants;

import java.util.List;

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
    private  JobMapper jobDao;

 /*  @Override
    public List<Job> search(String jname) {
        jname = "%" + jname + "%";
        List<Job> list = jobDao.search(jname);

        return list;
    }*/

}
