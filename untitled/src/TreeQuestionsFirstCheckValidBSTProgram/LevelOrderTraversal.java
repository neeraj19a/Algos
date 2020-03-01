package TreeQuestionsFirstCheckValidBSTProgram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://www.youtube.com/watch?v=XZnWETlZZ14
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return result;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        //we have some root thats why our program will reach this line because it has passed the above condition of being null
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode currentNode=queue.remove();
                currentLevel.add(currentNode.val);

                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.left.left=new TreeNode(0);
        treeNode.right = new TreeNode(3);

        System.out.println(treeNode);

        System.out.println(new LevelOrderTraversal().levelOrder(treeNode));
    }
}
