package com.six.finger.leetcode.five;

public class thirthfive {
    public static void main(String[] args) {

        int[] nums={2,3,1,2,4,3};
        int i = minSubArrayLen(7, nums);
        System.out.println(i);


    }

    public static int minSubArrayLen(int s,int[] nums){

        if (nums.length==0){
            return 0;
        }
        int res=Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j <nums.length ; j++) {
                sum=sum+nums[j];
                if (sum>s){
                   res= Math.min(res,j-i+1);
                    break;
                }

            }
        }

        return  res==Integer.MAX_VALUE?0:res;
    }
}
