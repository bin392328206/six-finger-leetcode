package com.six.finger.leetcode.five;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class one {
    public static void main(String[] args) {

        int[] a={2,7,11,15};

        int[] twosun = twosun(a, 9);


    }

    private static int[] twosun(int[] a, int i) {

        Map<Integer, Integer> map=new HashMap<>();
        int [] res=new int[2];
        for (int b =0;b<a.length;b++){
            if (map.containsKey(i-a[b])){
                res[0]=b;
                res[1]=map.get(i-a[b]);
            }else {
                map.put(a[b],b);
            }
        }
        return res;



    }

}
