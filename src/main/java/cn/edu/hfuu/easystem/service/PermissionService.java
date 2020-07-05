package cn.edu.hfuu.easystem.service;

import cn.edu.hfuu.easystem.Common.TreeNode;
import cn.edu.hfuu.easystem.entity.User;

import java.util.List;

public interface PermissionService {

    /**
     * 根据用户信息获取有效功能菜单
     *
     * @param user
     * @return
     */
    List<TreeNode> findMenuByUser(User user);

}
