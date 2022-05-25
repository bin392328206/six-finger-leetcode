package com.six.finger.leetcode.five;

import java.util.ArrayList;

/**
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 */

public class thirteen {

    public static void main(String[] args) {

    }

    public int[][] insert(int[][] intervals,int[] newInterval){

        if (intervals.length==0||newInterval.length==0){
            return new int[2][2];
        }

      ArrayList<int[]> res=new ArrayList<>();
        ArrayList<int[]> temp=new ArrayList<>();

        for (int[] interval : intervals) {
            temp.add(interval);
        }

        temp.add(newInterval);

        temp.sort((a,b)->a[0]-b[0]);

//        for (int[] re : temp) {
//            int[] last=res.size()==0?new int[]{-1,-1}:res.get(res.size()-1);
//
//            if (res.size()==0||last[1]<re[0]){
//                res.add(re);
//            }else {
//                last[1]=Math.max(re[0],last[1]);
//            }
//
//        }

        for (int[] num : temp) {

            if (res.size()==0||res.get(res.size()-1)[1]<num[0]){
                res.add(num);
            }else {
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],num[1]);
            }
        }
        return res.toArray(new int[res.size()][2]);

    }




}
