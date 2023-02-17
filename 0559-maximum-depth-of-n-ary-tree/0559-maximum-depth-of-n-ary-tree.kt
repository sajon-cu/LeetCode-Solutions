/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun maxDepth(root: Node?): Int {
        if(root == null) return 0
     
        var mDepth = 1
        
        for(child in root.children) {
            mDepth = Math.max(mDepth, maxDepth(child) + 1)
        }
        
        return mDepth
    }
}