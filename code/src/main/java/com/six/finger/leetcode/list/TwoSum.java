package com.six.finger.leetcode.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin3@joyy.sg
 * @version 1.0
 * @date 2021/10/21 21:25
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {


    public static void main(String[] args) {

        int [] a={2,7,11,15};
        int target=9;
        System.out.println(twoSum(a, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap();
        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }else {
                map.put(nums[i],i );
            }

        }

        return null;

    }
}
