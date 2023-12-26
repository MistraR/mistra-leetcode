package com.mistra.leetcode.dfs;

import java.util.Arrays;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/22
 * @ Description:
 *
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * 示例:
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 *
 * 该题目需要将所有被X包围的O找出来，那剩下的O就是连接起来与边界连通的O。直接找出来所有被X包围的O并不好找，
 * 但是我们可以用排除法：先找到所有连接起来与边界连通的O，将这些O标记一下，然后遍历数组，所有没有被标记的O就是我们要找的O。
 *
 * 首先对矩阵边界上所有的O做深度优先搜索，将相连的O更改为-，然后编辑数组，将数组中O更改为X，将数组中-更改为O。
 */
public class M130 {

    public static void main(String[] args) {
//        char[][] arr = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        char[][] arr = {{'O', 'O'}, {'O', 'O'}};
        solve(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void solve(char[][] board) {
        int h = board.length;
        int l = board[0].length;
        for (int i = 0; i < l; i++) {
            if (board[0][i] == 'O') {
                OTOA(board, 0, i);
            }
        }
        for (int i = 0; i < l; i++) {
            if (board[h - 1][i] == 'O') {
                OTOA(board, h - 1, i);
            }
        }
        for (int i = 0; i < h; i++) {
            if (board[i][0] == 'O') {
                OTOA(board, i, 0);
            }
        }
        for (int i = 0; i < h; i++) {
            if (board[i][l - 1] == 'O') {
                OTOA(board, i, l - 1);
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static void OTOA(char[][] board, int hang, int lie) {
        int h = board.length;
        int l = board[0].length;
        if (hang >= h || lie >= l || hang < 0 || lie < 0 || board[hang][lie] == 'X' || board[hang][lie] == 'A') {
            return;
        }
        board[hang][lie] = 'A';
        OTOA(board, hang + 1, lie);
        OTOA(board, hang - 1, lie);
        OTOA(board, hang, lie - 1);
        OTOA(board, hang, lie + 1);
    }

}
