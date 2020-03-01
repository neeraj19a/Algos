package TreeQuestionsFirstCheckValidBSTProgram;


//https://www.youtube.com/watch?v=PZYTs9y4f4o&list=PLE6mWNrn8E01LgWO-bSNtbC5SZvjboWy2&index=93&t=256s
public class ConvertSortedArrayBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums){
        if(nums==null|| nums.length==0){
            return null;
        }

        return constructBSTRecursive(nums,0,nums.length-1);
    }

    private TreeNode constructBSTRecursive(int[] nums,int left,int right){
        if(left>right){ // in BST left always is smaller than right
            return  null;
        }

        int mid=left+(right-left)/2;
        TreeNode treeNode=new TreeNode(nums[mid]);
        //in BST left side is always mid-1
        treeNode.left=constructBSTRecursive(nums,left,mid-1);
        //in BST right side is always mid+1
        treeNode.right=constructBSTRecursive(nums,mid+1,right);
        return treeNode;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        ConvertSortedArrayBinarySearchTree convertSortedArrayBinarySearchTree=new ConvertSortedArrayBinarySearchTree();
        System.out.println(convertSortedArrayBinarySearchTree.sortedArrayToBST(arr));
    }
}
