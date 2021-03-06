package cn.edu.hfuu.easystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("rz_sys_user")
public class User implements Serializable {
    @TableId(value = "userid", type = IdType.UUID)
    private String id;
    private String username;
    private String password;
    //用户状态  1 表示可用    0 表示禁用
    private Integer status;
    //用户类型  1 表示系统用户 0表示超级管理员
    private Integer type;
    private String salt;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastlogintime;
}
