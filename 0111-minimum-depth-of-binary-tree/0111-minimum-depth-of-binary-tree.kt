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
    fun minDepth(root: TreeNode?): Int {
        if(root == null) return 0
        val leftDept = minDepth(root.left)
        val rightDept = minDepth(root.right)
        
        if(leftDept <= 0) return rightDept + 1
        if(rightDept <= 0) return leftDept + 1
        return Math.min(leftDept, rightDept) + 1
    }
}