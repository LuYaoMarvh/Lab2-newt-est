import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class L123456_8_Test {

    // 测试目的：测试空数组的情况
    @Test
    void testEmptyGrid() {
        Solution8 solution = new Solution8();
        char[][] grid = {};
        assertEquals(0, solution.numIslands(grid));
    }

    // 测试目的：测试全为水的网格
    @Test
    void testAllWater() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                { '0', '0', '0' },
                { '0', '0', '0' },
                { '0', '0', '0' }
        };
        assertEquals(0, solution.numIslands(grid));
    }

    // 测试目的：测试全为陆地的网格
    @Test
    void testAllLand() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                { '1', '1', '1' },
                { '1', '1', '1' },
                { '1', '1', '1' }
        };
        assertEquals(1, solution.numIslands(grid));
    }

    // 测试目的：测试混合陆地和水的网格
    @Test
    void testMixedGrid() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        assertEquals(3, solution.numIslands(grid));
    }

    // 测试目的：测试1x1网格
    @Test
    void testSingleCell() {
        Solution8 solution = new Solution8();
        char[][] grid1 = { { '1' } };
        char[][] grid2 = { { '0' } };
        assertEquals(1, solution.numIslands(grid1));
        assertEquals(0, solution.numIslands(grid2));
    }
}
//改的不错