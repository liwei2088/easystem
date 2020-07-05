package cn.edu.hfuu.easystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@TableName("rz_sys_permission")
public class Permission implements Serializable {
    @TableId(value = "permissionid", type = IdType.UUID)
    private String id;
    private String pid;
    private String type;
    private String title;
    private String percode;
    private String icon;
    private String href;
    private String target;
    private Integer open;
    private Integer ordernum;
    private Integer status;
}
