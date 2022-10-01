class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert_val(root, val);
        return root;
    }
    TreeNode insert_val(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
        }
        if(val < root.val){
            root.left = insert_val(root.left, val);
        }else if(val > root.val){
            root.right = insert_val(root.right, val);
        }
        return root;
    }
}