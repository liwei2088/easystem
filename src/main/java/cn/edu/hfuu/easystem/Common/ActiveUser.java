package cn.edu.hfuu.easystem.Common;

import cn.edu.hfuu.easystem.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveUser {

    private User user;

    private List<String> roles;

    private List<String> permission;

}
