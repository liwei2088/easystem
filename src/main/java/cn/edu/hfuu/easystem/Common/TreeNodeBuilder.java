package cn.edu.hfuu.easystem.Common;

import java.util.ArrayList;
import java.util.List;

/**
 * 构建树形结构关系
 */
public class TreeNodeBuilder {

    public static List<TreeNode> build(List<TreeNode> treeNodes, String topPid) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        for (TreeNode n1 : treeNodes) {
            if (topPid.equals(n1.getPid())) {
                nodes.add(n1);
            }
            for (TreeNode n2 : treeNodes) {
                if (n1.getId().equals(n2.getPid())) {
                    n1.getChildren().add(n2);
                }
            }
        }
        return nodes;
    }
}
