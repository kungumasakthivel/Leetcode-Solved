class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }else{
            return help(root.left, root.right);
        }
    }
    
    public boolean help(TreeNode rLeft, TreeNode rRight){
        if(rLeft==null && rRight==null){
            return true;
        }else if(rLeft==null || rRight==null){
            return false;
        }else{
            if(rLeft.val == rRight.val){
                boolean one = help(rLeft.left,rRight.right);
                boolean two = help(rLeft.right,rRight.left);
                return one && two;
            }
        }
        return false;
    }
    
}