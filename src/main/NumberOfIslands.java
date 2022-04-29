package main;

public class NumberOfIslands {
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        final int GRID_COLS = grid[0].length;
        final int GRID_ROWS = grid.length;
        int islandCount = 0;

        visited = new boolean[GRID_ROWS][GRID_COLS];

        for(int row=0; row<GRID_ROWS; row++) {
            for(int col=0;col<GRID_COLS;col++) {
                if(grid[row][col] == '1' && !visited[row][col]) {//Found an island!
                    islandCount++;
                    dfs(grid,col,row);
                }
            }
        }
        return islandCount;
    }

    private void dfs(char[][] grid, int col, int row) {
        //anything above
        if(row-1>=0 && grid[row][col] == '1' && !visited[row-1][col]) {
            visited[row-1][col] = true;
            dfs(grid,col, row-1);
        }

        //anything below
        if(row+1<=grid.length-1 && grid[row][col] == '1' && !visited[row+1][col]) {
            visited[row+1][col] = true;
            dfs(grid,col, row+1);
        }

        //anything to the right
        if(col+1<=grid[row].length-1 && grid[row][col] == '1' && !visited[row][col+1]) {
            visited[row][col+1] = true;
            dfs(grid,col+1,row);
        }

        //anything to the left
        if(col-1>=0 && grid[row][col] == '1' && !visited[row][col-1]) {
            visited[row][col-1] = true;
            dfs(grid,col-1,row);
        }
    }
}
