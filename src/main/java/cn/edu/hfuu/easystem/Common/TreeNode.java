package cn.edu.hfuu.easystem.Common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    private String id;
    @JsonProperty("parentId")
    private String pid;
    private String title;
    private String icon;
    private String href;
    private Boolean spread;
    private String checkArr = "0";
    private List<TreeNode> children = new ArrayList<TreeNode>();

    public TreeNode(String id, String pid, String title, String icon, String href, Boolean spread) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.icon = icon;
        this.href = href;
        this.spread = spread;
    }

    public TreeNode(String id, String pid, String title, Boolean spread) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.spread = spread;
    }

    public TreeNode(String id, String pid, String title, Boolean spread, String checkArr) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.spread = spread;
        this.checkArr = checkArr;
    }
}
