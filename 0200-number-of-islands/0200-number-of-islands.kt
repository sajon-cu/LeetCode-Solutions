class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        var i = 0;
        var j = 0;
        
        val rowLen = grid.size
        
        grid.forEachIndexed {i, row ->
            // if(i == 1) return@forEachIndexed
            row.forEachIndexed { j, col ->
                // if(j == 1) return@forEachIndexed  
                if(grid[i].get(j) == '1') {
                    count += 1
                    bfs(grid, i, j)
                }
            }
        }
        
        return count;
    }
    
    private fun bfs(grid: Array<CharArray>, i: Int, j: Int) {
        
        if(i < 0 || i >= grid.size || j < 0 || j >= grid[i].size || grid[i][j] == '0') {
            return
        }
        
        println("i = $i j = $j [ij] = ${grid[i][j]}")
        
        grid[i][j] = '0'
        bfs(grid, i, j+1)
        bfs(grid, i+1, j)
        bfs(grid, i-1, j)
        bfs(grid, i, j-1)
    }
}