package com.zp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.dao.ApplicationRecordMapper;
import com.zp.dao.JobMapper;
import com.zp.entity.ApplicationRecord;
import com.zp.entity.Job;
import com.zp.service.ApplicationRecordService;
import com.zp.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service
public class ApplicationRecordServiceImpl extends ServiceImpl<ApplicationRecordMapper, ApplicationRecord> implements ApplicationRecordService {

    @Autowired
    private ApplicationRecordMapper applicationRecordMapper;
    @Autowired
    private JobMapper jobMapper;

    @Override
    public R getApplicationRecord(Integer pageNum,Integer pageSize,Integer uid,Integer type) {
        Map<Object, Object> map = new HashMap<>();
        List<Job> jobs = new ArrayList<>();
        List<Job> jobs1 = new ArrayList<>();
        Page<ApplicationRecord> page = new Page<>(pageNum,pageSize);
        IPage<Map<String, Object>> iPage = applicationRecordMapper.selectMapsPage(page, new QueryWrapper<ApplicationRecord>().
                and(i -> i.eq("uid", uid).eq("type",type)));
        List<Map<String, Object>> records = iPage.getRecords();
        for (Map mp: records) {
            Object jid = mp.get("jid");
            Job job = jobMapper.selectById((Serializable) jid);
            if(job.getType().equals("全职")){
                jobs.add(job);
            }else {
                jobs1.add(job);
            }
        }
        map.put("full-time",jobs);
        map.put("Internship",jobs1);
        return R.setOK("",map);
    }

}
