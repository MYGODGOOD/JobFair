package com.zp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.JobFairMapper;
import com.zp.entity.JobFair;
import com.zp.service.JobFairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class JobFairServiceImpl extends ServiceImpl<JobFairMapper, JobFair> implements JobFairService {

    @Autowired
    private JobFairMapper jobFairMapper;

    @Override
    public List<JobFair> searchJob(String city, String time, String school) {
        if(city!=null){
            city = "%" +  city  + "%";
        }
        if(time!=null){
           time = "%" + time + "%";
        }
        if(school!=null){
            school = "%" + school + "%";
        }
        return jobFairMapper.search(city,time,school);
    }
}
