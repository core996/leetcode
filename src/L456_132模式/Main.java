package L456_132模式;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-24 18:01
 */
public class Main {
    // todo 未做出
    public static void main(String[] args) {

    }
    public boolean find132pattern(int[] nums) {

       for (int x = nums.length -1 ; x >=0 ; x--){
           int index = x - 1 ;
           while (nums[x] > nums[index]){
                index-- ;
           }
       }
        return false ;
    }
}
