package cn.edu.hfuu.easystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {
    private String id;
    private String username;
    private String password;
    private String status;
    private Date createtime;
    private Date lastlogintime;
}
