package com.six.finger.leetcode.huawei.od.march;


import java.util.*;

/*
题目
疫情期间需要大家保证一定的社交距离
公司组织开交流会议，座位有一排共N个座位
编号分别为[0...n-1]
要求员工一个接着一个进入会议室
并且还可以在任何时候离开会议室
每当一个员工进入时，需要坐到最大社交距离的座位

例如：
位置A与左右有员工落座的位置距离分别为2和2
位置B与左右有员工落座的位置距离分别为2和3
影响因素都为两个位置，则认为作为A和B与左右位置的社交距离是一样的
如果有多个这样的座位
则坐到索引最小的那个座位
输入
会议室座位总数1 <= seatNum <= 100
员工的进出顺序seatOrLeave数组元素值为1表示进场，
元素值为负数表示出场(特殊：位置 0 的员工不会离开)
例如 -4 表示坐在位置 4 的员工离开(保证有员工坐在该座位上)

输出
最后进来员工，他会坐在第几个位置
如果位置已满 则输出-1

 */
public class SeatAdjustMent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seatNum = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();

        String[] split = s.substring(1, s.length() - 1).split(",");

        int[] seatOrLeave = new int[seatNum];

        for (int i = 0; i < split.length; i++) {
            seatOrLeave[i] = Integer.parseInt(split[i]);
        }

        System.out.println(seatDistance1(seatNum, seatOrLeave));

    }

    private static int seatDistance1(int seatNum, int[] seatOrLeave) {
        TreeSet<Integer> seatNums = new TreeSet<>();
        for (int i = 0; i < seatOrLeave.length; i++) {
            int op = seatOrLeave[i];

            if (op > 0) {
                //说明是进场
                if (seatNums.size() == 0) {
                    //说明是第一个进场
                    if (seatOrLeave.length - 1 == 0) {
                        return 0;
                    }
                    seatNums.add(0);
                } else if (seatNums.size() == 1) {
                    //说明是第二个 放最右边的
                    if (seatOrLeave.length - 1 == 1) {
                        return seatNum - 1;
                    }
                    seatNums.add(seatNum - 1);
                } else if (seatNums.size() > 1 && seatNums.size() < seatNum) {
                    //说明是中间的 把中间的排序
                    int[] ints = new int[seatNums.size()];
                    int count = 0;
                    for (Integer seatNum1 : seatNums) {
                        ints[count++] = seatNum1;
                    }

                    //循环ints 找到最远距离等于开始的距离+最大距离
                    int maxLen = 0;
                    int start = 0;

                    for (int i1 = 0; i1 < ints.length; i1++) {
                        int len = ints[i1 + 1] - ints[i1];
                        if (len / 2 > maxLen) {
                            maxLen = len / 2;
                            start = ints[i1];
                        }
                    }
                    seatNums.add(start + maxLen);

                    if (i == seatOrLeave.length - 1) {
                        return start + maxLen;
                    }


                } else {
                    //说明位置坐满了
                    return -1;
                }

            } else {
                //说明是出场
                seatNums.remove(-op);
            }

        }
        return 0;

    }


    public static int seatDistance(int seatNum, int[] seatOrLeave) {
        TreeSet<Integer> seatedNums = new TreeSet<>();  // 使用TreeSet有序集合记录被坐过的座位
        for (int i = 0; i < seatOrLeave.length; i++) {
            int op = seatOrLeave[i];
            if (op > 0) {
                if (seatedNums.size() == 0) {  // 如果是第一个坐
                    if (i == seatOrLeave.length - 1) {  // 如果只有一个位置
                        return 0;
                    }
                    seatedNums.add(0);
                } else if (seatedNums.size() == 1) {  // 第二个人进来，坐在最右边
                    seatedNums.add(seatNum - 1);
                    if (i == seatOrLeave.length - 1) {  // 如果只有两个位置
                        return seatNum - 1;
                    }
                } else if (seatedNums.size() > 1 && seatedNums.size() < seatNum) { // 坐到中间的位置
                    int[] ints = new int[seatedNums.size()];
                    int count = 0;
                    for (Integer seatedNum : seatedNums) {  // 将已经坐过的位置存入到数组中
                        ints[count++] = seatedNum;
                    }
                    int maxLen = 0;
                    int start = 0;
                    for (int j = 0; j < ints.length - 1; j++) {  // 计算最远距离
                        int len = ints[j + 1] - ints[j];
                        if (len / 2 > maxLen) {
                            maxLen = len / 2;
                            start = ints[j];
                        }
                    }
                    seatedNums.add(start + maxLen);  // 将对应的起始位置加上最远距离加入seatedNums
                    if (i == seatOrLeave.length - 1) {
                        return start + maxLen;
                    }
                } else {  // 位置坐满
                    return -1;
                }
            } else {  // 如果是负数，则将该座位移出
                seatedNums.remove(-op);
            }
        }
        return 0;
    }
}
