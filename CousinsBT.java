/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CousinsBT {
    public boolean isCousins(TreeNode root, int x, int y) {
    
        AtomicInteger px = new AtomicInteger();
        AtomicInteger py = new AtomicInteger();
        AtomicInteger dx = new AtomicInteger(-1);
        AtomicInteger dy = new AtomicInteger(-1);
        
        
        parentDepth(root, x, y , 0, dx, dy, px, py);
        if(px.get() != py.get() && dx.get() == dy.get())
            return true;
        else
            return false;
    }
    
    public void parentDepth(TreeNode root, int x , int y , int d , AtomicInteger dx, AtomicInteger dy ,
                            AtomicInteger px, AtomicInteger py  ){
        
        if(root == null)return ;
        
        if(root.left != null){
            if(root.left.val == x){
                px.set(root.val);
                dx.set(d + 1);
                } else if(root.left.val == y){
                
                py.set(root.val);
                dy.set(d+1);
            
            }
        }
        
        
         if(root.right != null){
            if(root.right.val == x){
                px.set(root.val);
                dx.set(d + 1);
                } else if(root.right.val == y){
                
                py.set(root.val);
                dy.set(d+1);
            }
        }
        
        if(dx.get() != -1 && dy.get() != -1) return ;
        
        parentDepth(root.left, x, y , d+1, dx, dy, px, py);
         parentDepth(root.right, x, y , d+1, dx, dy, px, py);   
    } 
}
