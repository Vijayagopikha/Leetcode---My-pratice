class Solution {
public:
 int dfs(vector<vector<int>>& grid, int i, int j) {
        // Check if the current cell is out of bounds or not land
        if (i < 0 || i >= grid.size() || j < 0 || j >= grid[0].size() || grid[i][j] == 0) {
            return 0;
        }
        
        // Mark the current cell as visited by setting it to 0
        grid[i][j] = 0;
        
        // Initialize the area of this cell as 1
        int area = 1;
        
        // Explore all 4 directions: up, down, left, right
        area += dfs(grid, i + 1, j); // down
        area += dfs(grid, i - 1, j); // up
        area += dfs(grid, i, j + 1); // right
        area += dfs(grid, i, j - 1); // left
        
        return area;
    }

    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int max_area = 0;
        for (int i = 0; i < grid.size(); ++i) {
            for (int j = 0; j < grid[0].size(); ++j) {
                // If we find a land cell ('1'), calculate the area of the island
                if (grid[i][j] == 1) {
                    max_area = max(max_area, dfs(grid, i, j));
                }
            }
        }
        return max_area;
    }
};
