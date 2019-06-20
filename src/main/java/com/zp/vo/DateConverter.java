package com.zp.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lixinjian
 * @date 2019/6/11 17:45
 */
public class DateConverter {

    public Date StringToDate(String dateStr){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        try {
            date = sdf.parse(dateStr);
            return date;
        } catch (Exception e) {
            return null;
        }
    }


}
