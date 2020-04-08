//给定一个仅包含 0 和 1 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。 
//
// 示例: 
//
// 输入:
//[
//  ["1","0","1","0","0"],
//  ["1","0","1","1","1"],
//  ["1","1","1","1","1"],
//  ["1","0","0","1","0"]
//]
//输出: 6 
// Related Topics 栈 数组 哈希表 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        //表示以i，j为右下角的最大矩形的面积
        int[][] stage = new int[m][n];
        stage[0][0] = matrix[0][0] == '1' ? 1 : 0;


        return stage[m-1][n-1];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
