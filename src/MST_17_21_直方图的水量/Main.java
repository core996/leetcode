package MST_17_21_直方图的水量;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-04-02 16:42
 */
public class Main {
    // todo 动态规划 方法未做出1
    public static void main(String[] args) {

    }

    /**
     * 木桶理论找到左右两边的最大减去当前
     * 执行用时：142 ms, 在所有 Java 提交中击败了5.01%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了 8.00%的用户
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        int result = 0 ;
        for (int x = 0 ; x < height.length ; x++){
            int cur = height[x] ;
            int left=0,right=0 ;
            for ( int y = 0 ; y < height.length ; y++){
                int num = height[y] ;
               if (y > x){
                   if (num > right){
                        right = num ;
                   }
               }
               if (y < x){
                   if (num > left){
                       left = num ;
                   }
               }
            }
            int size = Math.min(right,left)-cur ;
            if (size>=0){
                result+=size ;
            }
        }

        return result ;
    }
}
