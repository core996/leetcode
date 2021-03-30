package L190_颠倒二进制位;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-29 17:11
 */
public class Main {

    public static void main(String[] args) {

    }


    /**
     * 左移 ， 右移
     * @param n
     * @return
     */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0 ;
        for (int i = 0 ; i < 32 ; i++){
            int nlast = n&1 ;
            res = res<<1 ;
            res = res|nlast ;
            n = n>>1 ;
        }
        return res ;
    }
}
