package com.six.finger.leetcode.list;

/*
在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。

给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。

重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。

如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。


输入：mat = [[1,2],[3,4]], r = 1, c = 4
输出：[[1,2,3,4]]

 */

public class MatrixReshape {

    public static void main(String[] args) {
        int intA[][]={{1,2},{3,4}};


        System.out.println(matrixReshape(intA, 4, 1));

    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {

        int n=nums.length;
        int m=nums[0].length;

        if (n*m!=r*c){
            return nums;
        }

        int[][] ans=new int[r][c];
        for (int i = 0; i < m*n; i++) {
            ans[i/r][i%c]=nums[i/n][i%m];
        }

        return ans;

    }
}
