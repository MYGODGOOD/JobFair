package com.zp.controlleradvice;

import com.zp.vo.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理加强控制器
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    /**
     * 全局异常处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public R errorHandler(Exception ex){
        return R.setERROR(ex);
    }
}
