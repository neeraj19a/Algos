package TreeQuestionsFirstCheckValidBSTProgram;

//https://www.youtube.com/watch?v=PZYTs9y4f4o&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=93&t=256s
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val=x;
    }

    //It important to override this otherwise we can't get value of TreeNodes
    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
