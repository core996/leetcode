package L1720_解码异或后的数组;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-01 18:24
 */
public class Main {

    public static void main(String[] args) {

    }
    public static int[] decode(int[] encoded, int first) {
        int length = encoded.length ;
        int result[] = new int[length+1] ;
        result[0] = first ;
        for(int x = 1 ; x < length+1 ; x++){
            result[x] = encoded[x-1]^result[x-1] ;
        }
        return result ;
    }
}
