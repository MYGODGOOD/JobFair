package com.zp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.entity.JobFair;

import java.util.Date;
import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface JobFairService extends IService<JobFair> {

    public List<JobFair> searchJob(String city, String time,String school);

}
