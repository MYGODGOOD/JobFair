package com.zp.controller;


import com.zp.service.SchoolEnterpriseService;
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
@RequestMapping("/schoolEnterprise")
public class SchoolEnterpriseController {

    private SchoolEnterpriseService schoolEnterpriseService;

}

