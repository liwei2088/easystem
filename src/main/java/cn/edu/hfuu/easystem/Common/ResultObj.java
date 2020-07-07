package cn.edu.hfuu.easystem.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj<T> {

    private Integer code;
    private String msg;
    private Long count;
    private List<T> data;

    public ResultObj(Integer code, List<T> data) {
        this.code = code;
        this.msg = null;
        this.data = data;
        this.count = null;
    }

    public ResultObj(Integer code, Long count, List<T> data) {
        this.code = code;
        this.msg = null;
        this.data = data;
        this.count = count;
    }

    public ResultObj(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
        this.count = null;
    }

    public static final ResultObj LOGIN_SUCCESS = new ResultObj(200, "登陆成功");
    public static final ResultObj LOGIN_ERROR_PASS = new ResultObj(-1, "用户名或密码错误");
    public static final ResultObj LOGIN_ERROR_CODE = new ResultObj(-1, "验证码错误");

}
