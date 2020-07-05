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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@TableName("rz_sys_role")
public class Role implements Serializable {
    @TableId(value = "roleid", type = IdType.UUID)
    private String id;
    private String name;
    private String remark;
    private Integer status;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
}
