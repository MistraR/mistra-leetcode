package com.mistra.leetcode.dfs;

/**
 * @author wrmistra@gmail.com
 * @date 2023/4/23
 * @ Description:
 *
 * 给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 示例 1：
 *
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 */
public class M79 {
    public static void main(String[] args) {
//        char[][] arr = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
//        System.out.println(exist(arr, "ABCCED"));
        char[][] arr2 = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(arr2, "SEE"));
    }

    public static boolean exist(char[][] board, String word) {
        int hang = board.length;
        int lie = board[0].length;
        char[] chars = word.toCharArray();
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < lie; j++) {
                if (board[i][j] == chars[0] && dfs(board, i, j, chars, 0)) {
                    // 当前字符==字符串第一个字符时，就开启深度优先搜索，并且返回true时才提前返回结果，不满足则遍历下一个节点
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, char[] chars, int index) {
        int hang = board.length;
        int lie = board[0].length;
        if (i < 0 || i >= hang || j < 0 || j >= lie || board[i][j] != chars[index]) {
            // 处理超出边界的，直接返回false，字符不相等的也直接返回false
            return false;
        }
        if (index == chars.length - 1) {
            // 说明遍历到了字符串最后一个字符，且相等，说明找到了，返回true
            return true;
        }
        char tmp = board[i][j];
        board[i][j] = '-';// 走过的字符置为-  避免重复走到
        boolean a = dfs(board, i, j + 1, chars, index + 1);//开启上下左右的dfs
        boolean b = dfs(board, i, j - 1, chars, index + 1);
        boolean c = dfs(board, i + 1, j, chars, index + 1);
        boolean d = dfs(board, i - 1, j, chars, index + 1);
        board[i][j] = tmp;// 恢复节点字符为原来的字符
        return a || b || c || d;// 只要上下左右某个节点找到了，就返回true
    }
}
