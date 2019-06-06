package com.zp.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Data
@TableName("user_resume")
public class UserResume extends Model<UserResume> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    @TableField("work_experience")
    private String workExperience;
    @TableField("edu_experience")
    private String eduExperience;
    @TableField("job_intention")
    private String jobIntention;
    @TableField("train_experience")
    private String trainExperience;
    private String language;



}
