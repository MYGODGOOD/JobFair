package com.zp.controller;


import com.zp.entity.ApplicationRecord;
import com.zp.service.ApplicationRecordService;
import com.zp.vo.R;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/applicationRecord")
public class ApplicationRecordController {
    @Autowired
    private ApplicationRecordService arcService;

    @ApiOperation("获取用户的申请或收藏记录")
    @GetMapping("/pageApRds")
    public R getApplicationRecord(Integer pageNum,Integer pageSize,
                                  Integer uid,@ApiParam(name = "类别编号",
            value = "1代表收藏，2代表申请") Integer type){
        R applicationRecord = arcService.getApplicationRecord(pageNum, pageSize, uid,type);
        return applicationRecord;
    }

    @ApiOperation("添加用户的申请或收藏")
    @PostMapping("/pageApRds")
    public R addApplicationRecord(ApplicationRecord applicationRecord){
        boolean save = arcService.save(applicationRecord);
        return R.setOK("",save);
    }


}

