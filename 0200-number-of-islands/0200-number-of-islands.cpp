class Solution {
public:
    void dfs(vector<vector<char>>& grid, int i, int j) {
        // Check if the current cell is out of bounds or not land
        if (i < 0 || i >= grid.size() || j < 0 || j >= grid[0].size() || grid[i][j] == '0') {
            return;
        }
        
        // Mark the current cell as visited
        grid[i][j] = '0';
        
        // Explore all 4 directions: up, down, left, right
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    int numIslands(vector<vector<char>>& grid) {
        int num_islands = 0;
        for (int i = 0; i < grid.size(); ++i) {
            for (int j = 0; j < grid[0].size(); ++j) {
                // If we find a land cell ('1'), we start a DFS
                if (grid[i][j] == '1') {
                    ++num_islands;
                    dfs(grid, i, j);
                }
            }
        }
        return num_islands;
    }
};
