package TreeQuestionsFirstCheckValidBSTProgram;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=Hg82DzMemMI
public class PathSumBSTORRootToLeafToSum {

    //With List<TreeNode> we will store all the Nodes that form the expected Sum, we are using here List<Integer> to make it easy
    public boolean hasPathSum(TreeNode root, int sum, List<Integer> path){
        //if we have reached leaf nodes and we didn't find sum we return false
        if(root==null){
            return false;
        }
        //if on left side and right side we have null and sum-root.val=0 means we have reached to stage where sum has found
        else if(root.left==null&& root.right==null&& sum-root.val==0){
            //Adding all nodes in path
            path.add(root.val);
            return true;
        }
        else {
            //else keep finding sum
           if( hasPathSum(root.left,sum-root.val,path)||hasPathSum(root.right,sum-root.val,path)){
               //Adding all nodes in path
               path.add(root.val);
               return true;
           }
           else
               return false;
        }
    }

    public static void main(String[] args) {
        PathSumBSTORRootToLeafToSum pathSumBST=new PathSumBSTORRootToLeafToSum();
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);


        treeNode.right = new TreeNode(4);
        List<Integer> result = new ArrayList<>();
        System.out.println(treeNode);
        System.out.println(pathSumBST.hasPathSum(treeNode,9,result));
        System.out.println(result);
    }
}
