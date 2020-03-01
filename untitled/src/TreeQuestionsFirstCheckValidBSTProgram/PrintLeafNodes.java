package TreeQuestionsFirstCheckValidBSTProgram;

public class PrintLeafNodes {

    public void printleafNodes(TreeNode treeNode){

        //check for null condition
        if(treeNode==null)
            return;
        //check if left and right node are null, because leaft node is where node ends and it doesn't have any nodes connected to it in both left and right side
        if(treeNode.left==null&& treeNode.right==null){
            System.out.println(treeNode.val);
        }
        //recursively check for left and right
        printleafNodes(treeNode.left);
        printleafNodes(treeNode.right);

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.left.left=new TreeNode(0);
        treeNode.right = new TreeNode(3);

        System.out.println(treeNode);
        new PrintLeafNodes().printleafNodes(treeNode);
    }
}
