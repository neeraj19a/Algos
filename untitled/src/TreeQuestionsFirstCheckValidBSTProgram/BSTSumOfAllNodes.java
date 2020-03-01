package TreeQuestionsFirstCheckValidBSTProgram;

public class BSTSumOfAllNodes {

    int sum = 0;

    private int calculate(TreeNode root) {
        sum = root.val;

        return sum;
    }

    public int totalCalculate(TreeNode treeNode) {
        sum += (treeNode.val) + calculate(treeNode.left) + calculate(treeNode.right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(-15);
        treeNode.left.left = new TreeNode(-40);
        treeNode.left.right = new TreeNode(3);

        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(50);


        BSTSumOfAllNodes bstSum = new BSTSumOfAllNodes();

        System.out.println(treeNode);
        System.out.println(bstSum.totalCalculate(treeNode));
    }
}
