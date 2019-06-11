package com.zp.controller;


import com.zp.service.JobService;
import com.zp.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Api(value = "找全职", tags = "全职搜索")
@ResponseBody
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @ApiOperation(value = "找全职", notes = "搜索所有全职职位")
    @GetMapping("/fulltime.do")
    @CrossOrigin
    public R findFulltimeJob(String hangye, String jname, Date pubDate, String workPlace){

        return R.setOK("ok",jobService.findfindFulltimeJobByCondition(hangye,jname,pubDate,workPlace));

    }

    @ApiOperation(value = "找实习", notes = "搜索所有实习职位")
    @GetMapping("/parttime.do")
    @CrossOrigin
    public R findParttimeJob(String hangye, String jname, Date pubDate, String workPlace){

        return R.setOK("ok",jobService.findfindParttimeJobByCondition(hangye,jname,pubDate,workPlace));

    }




}

