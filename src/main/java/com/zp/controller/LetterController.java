package com.zp.controller;


import com.zp.service.LetterService;
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
@Api(value = "站内信模块", tags = "根据id查找站内信")
@RestController
@RequestMapping("/letter")
public class LetterController {

    @Autowired
    private LetterService letterService;

    @ApiOperation(value = "站内信", notes = "根据id查找所有站内信")
    @GetMapping("/userLetter.do")
    @CrossOrigin
    public R findLetterById(int id){
        return R.setOK("ok",letterService.findLetterById(id));
    }



}

