package Tree;

public class TreeDoesValueExist {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode aa = new TreeNode(5);
        TreeNode ab = new TreeNode(1);
        TreeNode aaa = new TreeNode(2);
        TreeNode aab = new TreeNode(1);
        TreeNode aba = new TreeNode(3);
        TreeNode abb = new TreeNode(6);

        a.getChildren().add(aa);
        a.getChildren().add(ab);
        aa.getChildren().add(aaa);
        aa.getChildren().add(aab);
        ab.getChildren().add(aba);
        ab.getChildren().add(abb);

        boolean result = doesValueExist(a, 6);
        int resultDepth = whichDepthDoesValueExist(a, 9);
        System.out.println("Result:" + result + "," + resultDepth);
    }

    public static boolean doesValueExist(TreeNode treeNode, int findValue) {
        if(treeNode.getValue()==findValue){
            return true;
        }
        for (TreeNode child: treeNode.getChildren()) {
            if(doesValueExist(child,findValue)){
                return true;
            }
           }

        return false;
    }

    public static int whichDepthDoesValueExist(TreeNode treeNode, int findValue) {

        int depth = 0;
        if(treeNode.getValue()!=findValue) {
            depth++;
            for (TreeNode child: treeNode.getChildren()) {

                if(child.getValue()!=findValue){
                    whichDepthDoesValueExist(child,findValue);
                }

            }
        }

        return depth ;
    }
}
