package com.zp.controller;


import com.zp.service.UserResumeService;
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
@RequestMapping("/userResume")
public class UserResumeController {

    private UserResumeService userResumeService;

}

