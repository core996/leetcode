package L338_比特位计数;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-03 17:23
 */
public class Main {
    // TODO 动态规划优化未学习
    public static void main(String[] args) {

    }
    public static int[] countBits(int num) {
        int result[] = new int[num+1] ;
        for (int x = 0 ; x < num+1 ; x++){
            String s = Integer.toBinaryString(x);
            int n =  0 ;
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if ('1' == aChar){
                    n++ ;
                }
            }
            result[x] = n ;

        }
        return result ;
    }

    public static int[] countBits1(int num) {
        int result[] = new int[num+1] ;
        for (int x = 0 ; x < num+1 ; x++){

        }
        return result ;
    }


}
