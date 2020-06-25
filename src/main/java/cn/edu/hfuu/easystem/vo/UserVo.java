package cn.edu.hfuu.easystem.vo;

import cn.edu.hfuu.easystem.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends User {
    private Integer page = 1;
    private Integer limit = 10;

    private String code;
}
