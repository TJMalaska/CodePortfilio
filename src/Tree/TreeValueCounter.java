package Tree;

public class TreeValueCounter {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode aa = new TreeNode(5);
        TreeNode ab = new TreeNode(1);
        TreeNode aaa = new TreeNode(2);
        TreeNode aab = new TreeNode(1);
        TreeNode aba = new TreeNode(3);
        TreeNode abb = new TreeNode(1);

        a.getChildren().add(aa);
        a.getChildren().add(ab);
        aa.getChildren().add(aaa);
        aa.getChildren().add(aab);
        ab.getChildren().add(aba);
        ab.getChildren().add(abb);

        int result = countValues(a);
        System.out.println("Result:" + result);
    }

    public static int countValues(TreeNode treeNode) {
        int total = 0;
        for (TreeNode child: treeNode.getChildren()) {
            total += countValues(child);;
        }

        return total + treeNode.getValue();
    }
}
