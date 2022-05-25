package com.six.finger.leetcode.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/merge-intervals
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class tewlve {

    public static void main(String[] args) {




    }


    public int[][] merge(int[][] nums){

        if (nums==null||nums.length<2){
            return nums;
        }

        List<int[]> res=new ArrayList<>();

        Arrays.sort(nums,(x,y)->
            x[0]-y[0]
        );

        for (int[] num : nums) {

            if (res.size()==0||res.get(res.size()-1)[1]<num[0]){
                res.add(num);
            }else {
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],num[1]);
            }
        }
        return res.toArray(new int[res.size()][2]);

    }
}
