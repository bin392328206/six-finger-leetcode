package com.six.finger.leetcode.five;

/*

```
输入： nums = [-2,1,-3,4,-1,2,1,-5,4]
输出： 6
解释： 连续子数组 [4,-1,2,1] 的和最大，为 6 。
```
 */

public class twentytwo {
    public static void main(String[] args) {

    }

    public static int getMax(int[] nums) {
        //首先定义我们的返回值
        int res = Integer.MIN_VALUE;
        //定义局部最优解
        int temp = 0;

        //遍历nums

        for (int num : nums) {
            //算一算局部的解
            temp = temp + num;
            //把局部解和全局解比较，得出最优
            res = Math.max(res, temp);

            //   判断局部的解，如果小于0，就给他变成0

            if (temp < 0) {
                temp = 0;
            }
        }
        return  res;
    }


}
