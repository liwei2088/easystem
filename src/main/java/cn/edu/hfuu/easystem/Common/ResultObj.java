package cn.edu.hfuu.easystem.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {
    private Integer code;
    private String msg;

    public static final ResultObj LOGIN_SUCCESS=new ResultObj(200,"登陆成功");
    public static final ResultObj LOGIN_ERROR_PASS=new ResultObj(-1,"用户名或密码错误");
    public static final ResultObj LOGIN_ERROR_CODE=new ResultObj(-1,"验证码错误");

}
