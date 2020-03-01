package TreeQuestionsFirstCheckValidBSTProgram;

//https://www.java2novice.com/java-interview-programs/validate-binary-search-tree-bst/
public class ValidBST {

    public boolean isBinarySearchTree(TreeNode root) {

        if (root == null) return true;
        //Start with root node. In this case root node data min & max values can be extreme integer ranges. Pass min value as Integer.MIN_VALUE and max value as Integer.MAX_VALUE.
        return isBstValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBstValid(TreeNode root, Integer minValue, Integer maxValue) {
        //Null check for node , if root node is null, we will declare it is BST
        if (root == null) return true;
        //we verify Node data with min and max value of integers, after that we verify min and max values in left and right
        if (root.val >= minValue && root.val < maxValue
                && isBstValid(root.left, minValue, root.val)
                && isBstValid(root.right, root.val, maxValue)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidBST validBST = new ValidBST();
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        System.out.println(treeNode);
        System.out.println(validBST.isBinarySearchTree(treeNode));
    }
}
