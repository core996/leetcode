package L303_区域和检索_数组不可变;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-01 17:40
 */
public class Main {

    public static void main(String[] args) {
        int [] data = {1,2,3,4} ;
        NumArray1 numArray1 = new NumArray1(data);
        System.out.println(Arrays.toString(numArray1.sum));

    }

    /**
     * 调用计算前缀和
     */
    class NumArray {
        int nums[] ;
        public NumArray(int[] nums) {
            this.nums = nums ;
        }

        public int sumRange(int i, int j) {
            int result = 0 ;
            while (j-i >=0){
                result += nums[i] ;
                i++ ;
            }
            return result ;
        }
    }

    /**
     * 提前计算前缀和
     */
    static class NumArray1 {
        int sum[] ;
        public NumArray1(int[] nums) {
            int n = nums.length  ;
            sum = new int[n+1] ;
            for (int x = 1 ; x <= n ; x++){
                sum[x] = sum[x-1]+nums[x-1] ;
            }
        }

        public int sumRange(int i, int j) {
           return sum[++j]- sum[++i-1] ;
        }
    }
}
