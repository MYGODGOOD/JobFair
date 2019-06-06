package com.zp.controller;


import com.zp.service.ApplicationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
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

}

