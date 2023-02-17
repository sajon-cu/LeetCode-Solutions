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
    var isMirror = false
    fun isSymmetric(root: TreeNode?): Boolean {
        return this.checkIsMirror(root?.left, root?.right)
    }
    
    fun checkIsMirror(lRoot: TreeNode?, rRoot: TreeNode?): Boolean {
        print(lRoot?.`val`)
        print(rRoot?.`val`)
        if(lRoot == null && rRoot == null) return true
        if(lRoot == null || rRoot == null || lRoot.`val` != rRoot.`val`) return false
        
        return checkIsMirror(lRoot?.left, rRoot?.right) && checkIsMirror(lRoot?.right, rRoot?.left)
    }
}