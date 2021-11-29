package data.structures.examples.leetcode.challenges;

import java.util.Arrays;

/**
 * @author ilariacorda on 32/01/2021.
 * @project
 *
 * Problem Description
 * n a N x N grid representing a field of cherries, each cell is one of three possible integers.
 *
 * 0 means the cell is empty, so you can pass through;
 * 1 means the cell contains a cherry, that you can pick up and pass through;
 * -1 means the cell contains a thorn that blocks your way.
 *
 * Your task is to collect maximum number of cherries possible by following the rules below:
 *
 * Starting at the position (0, 0) and reaching (N-1, N-1) by moving right or down through valid path cells (cells with value 0 or 1);
 * After reaching (N-1, N-1), returning to (0, 0) by moving left or up through valid path cells;
 * When passing through a path cell containing a cherry, you pick it up and the cell becomes an empty cell (0);
 * If there is no valid path between (0, 0) and (N-1, N-1), then no cherries can be collected.
 */
public class CherryPickup {
    class Solution {

        public int cherryPickup(int[][] grid) {
            int n = grid.length;
            return Math.max(0, move(grid, n, 0, 0, 0, new Integer[n][n][n]));
        }

        private int move(int[][] grid, int n, int r1, int c1, int c2, Integer[][]... memoization) {
            int r2 = r1 + c1 - c2;
            if (r1 < n && c1 < n && r2 < n && c2 < n && grid[r1][c1] != -1 && grid[r2][c2] != -1) {
                if (r1 != n - 1 || c1 != n - 1) {
                    if (memoization[r1][c1][c2] == null) {
                        if (r1 == r2 && c1 == c2) {
                            memoization[r1][c1][c2] = grid[r1][c1];
                        } else memoization[r1][c1][c2] = grid[r1][c1] + grid[r2][c2];
                        return memoization[r1][c1][c2] += Math.max(Math.max(move(grid, n, r1 + 1, c1, c2, memoization), move(grid, n, r1, c1 + 1, c2, memoization)),
                                Math.max(move(grid, n, r1 + 1, c1, c2 + 1, memoization), move(grid, n, r1, c1 + 1, c2 + 1, memoization)));
                    } else {
                        return memoization[r1][c1][c2];
                    }
                } else {
                    return grid[r1][c1];
                }
            } else {
                return Integer.MIN_VALUE;
            }
        }
    }
}
