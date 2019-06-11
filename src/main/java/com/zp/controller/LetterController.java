package com.zp.controller;


import com.zp.entity.Letter;
import com.zp.service.LetterService;
import com.zp.vo.R;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/letter")
public class LetterController {
    @Autowired
    private LetterService letterService;

    @ApiOperation("批量添加面试通知")
    @PostMapping("/letters")
    public R addLetter(Collection<Letter> letters){
        boolean saveBatch = letterService.saveBatch(letters, 10);
        return R.setOK("",saveBatch);
    }

    @ApiOperation("查询用户面试通知,包括通过关键字查询")
    @GetMapping("/letters/{uid}/{key}")
    public R getUserLetters(@PathVariable("uid") Integer uid,
                            @ApiParam("关键字查询，不传默认查询全部") @PathVariable("key") String key,
                            Integer pageNum,Integer pageSize){
        R r = letterService.getUserLetters(pageNum, pageSize, uid, key);
        return r;
    }

}

