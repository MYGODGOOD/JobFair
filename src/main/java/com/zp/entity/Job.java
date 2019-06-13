package com.zp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@TableName("job")
@Data
public class Job extends Model<Job> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "jid", type = IdType.AUTO)
    private Integer jid;    //职位id
    private String jname;   //职位名称
    private Integer eid;    //企业id
    private Date pub_date;    //发布日期
    private Integer uid;     //应聘id
    private String hangye;   //行业
    @TableField("work_place")
    private String workPlace;  //工作地点
    private String type; //类别


}
