package com.zp.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zp.entity.JobFair;
import com.zp.service.JobFairService;
import com.zp.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Api(value = "操作宣聘会",tags = "操作宣聘会")
@RestController
@RequestMapping("/job")
public class JobFairController {

    @Autowired
    private JobFairService jobFairService;

    @ApiOperation(value = "搜索宣聘会",notes = "搜索宣聘会")
    @GetMapping("/jobfair.do")
    @CrossOrigin
    public R query(String city, String time, String school){
      List list = jobFairService.searchJob(city,time,school);
        return R.setOK("ok",list);
    }

}

