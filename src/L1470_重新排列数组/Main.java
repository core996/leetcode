package L1470_重新排列数组;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-02-26 18:16
 */
public class Main {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int []result = new int[nums.length] ;
        int num = 0 ;
        for (int x = 0 ; x < n ; x++){
            result[num++] = nums[x] ;
            result[num++] = nums[x+n] ;
        }
        return result ;
    }
}
