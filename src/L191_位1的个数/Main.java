package L191_位1的个数;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-22 17:34
 */
public class Main {
    public static void main(String[] args) {
        hammingWeight2(-3);
        System.out.println(-3>>1);
        System.out.println(-3>>>1);
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result = 0 ;
        while (n!=0){
            result+=n&1;
            n = n>>1 ;
        }
        return result ;
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight2(int n) {
        int result = 0 ;
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ('1'==aChar){
                result++ ;
            }
        }
        return result ;
    }
}
