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
    private val res = arrayListOf<Int>();
    
    fun inorderTraversal(root: TreeNode?): List<Int> {
        travers(root)
        return res
    }
    
    private fun travers(root: TreeNode?) {
        if(root == null) return
        travers(root.left)
        res.add(root.`val`)
        travers(root.right)
    }
}