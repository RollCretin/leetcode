/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: C1_两数之和
 * Author:   cretin
 * Date:     4/16/20 09:49
 * Description: C1_两数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 〈C1_两数之和〉
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 *
 * @author cretin
 * @create 4/16/20
 * @since 1.0.0
 */
public class C1_两数之和 {
    public static void main(String[] a) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum1(nums, target);
        for ( int i : result ) {
            System.out.println(i);
        }
        System.out.println("--------------");
        result = twoSum2(nums, target);
        for ( int i : result ) {
            System.out.println(i);
        }
    }

    //暴力方式
    private static int[] twoSum1(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++ ) {
            for ( int j = i + 1; j < nums.length; j++ ) {
                if ( nums[i] + nums[j] == target ) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    //暴力方式
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> temp = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ) {
            int tempNum = target - nums[i];
            if(temp.containsKey(tempNum)){
                return new int[]{temp.get(tempNum),i};
            }
            temp.put(nums[i],i);
        }
        return new int[2];
    }
}