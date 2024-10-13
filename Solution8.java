/**
 * @description:
 *
 *               给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 *               岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 *               此外，你可以假设该网格的四条边均被水包围。
 *
 *
 *
 *               示例 1：
 *
 *               输入：grid = [
 *               ["1","1","1","1","0"],
 *               ["1","1","0","1","0"],
 *               ["1","1","0","0","0"],
 *               ["0","0","0","0","0"]
 *               ]
 *               输出：1
 *               示例 2：
 *
 *               输入：grid = [
 *               ["1","1","0","0","0"],
 *               ["1","1","0","0","0"],
 *               ["0","0","1","0","0"],
 *               ["0","0","0","1","1"]
 *               ]
 *               输出：3
 *
 *
 *               提示：
 *
 *               m == grid.length
 *               n == grid[i].length
 *               1 <= m, n <= 300
 *               grid[i][j] 的值为 '0' 或 '1'
 *
 */
class Solution8 {
    // 深度优先搜索方法，用于标记已访问的岛屿部分
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        // 如果超出边界或者当前格子是水，直接返回
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        // 标记当前格子为已访问
        grid[r][c] = '0';

        // 向四个方向拓展搜索
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    // 计算岛屿数量的方法
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }
}
