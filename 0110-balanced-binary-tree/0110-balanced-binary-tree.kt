/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null) return true
        
        var leftHeight = 0
        var rightHeight = 0
        
        leftHeight = this.calculateHeight(root.left)
        rightHeight = this.calculateHeight(root.right)
        
        if(Math.abs(leftHeight-rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true
        }
        
        return false
    }
    
    private fun calculateHeight(root: TreeNode?): Int {
        if(root == null) return 0
        
        return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right))
    }
}