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
    val l1 = mutableListOf<Int>()
    val l2 = mutableListOf<Int>()
    
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        println(p)
        println(q)
        if(p == null && q == null) return true
        if(p == null || q == null) return false
        
        var isTrue = false
        if(p.`val` == q.`val`) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
        
        return false
    }
}