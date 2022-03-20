package Tree;


import java.util.ArrayList;

public class TreeNode {
    private int value;
    private ArrayList<TreeNode> children = new ArrayList<TreeNode>();

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }
}
