package com.six.finger.leetcode.list;

/*


给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。

进阶：

一个直观的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
你能想出一个仅使用常量空间的解决方案吗？
 */

public class SetZeroes {

    public static void main(String[] args) {

        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);


    }

    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[] row=  new boolean[m];
        boolean[] col=new boolean[n];


        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
            
        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }

        System.out.println("a");
    }
}

