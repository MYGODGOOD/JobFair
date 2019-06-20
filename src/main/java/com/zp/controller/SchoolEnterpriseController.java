package com.zp.controller;


import com.zp.service.SchoolEnterpriseService;
import com.zp.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Api(value = "查询校企信息", tags = "校企风采")
@RestController
@RequestMapping("/schoolEnterprise")
public class SchoolEnterpriseController {

    @Autowired
    private SchoolEnterpriseService schoolEnterpriseService;

    @ApiOperation(value = "找全职", notes = "搜索所有全职职位")
    @GetMapping("/fulltime.do")
    @CrossOrigin
    public R findSE(){
        return R.setOK("ok",schoolEnterpriseService.findSE());
    }

}

