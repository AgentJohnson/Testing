package main;

import java.util.HashMap;
import java.util.Map;

class Solution {

}

public class Main {
    public static void main(String[] args) {
	    System.out.println(new Fibonacci().fib(50));
        System.out.println(new UniquePaths().uniquePaths(6,6));

        char[][] grid = {
        {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};

        System.out.println(new NumberOfIslands().numIslands(grid));
    }

}
