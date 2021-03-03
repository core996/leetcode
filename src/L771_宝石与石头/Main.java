package L771_宝石与石头;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-02-25 18:02
 */
public class Main {
    public static void main(String[] args) {
        String s = "aa" ;
        String a = "[^"+s+']';

        System.out.println(a);
        System.out.println(Arrays.toString(s.toCharArray()));
    }

    /**
     *  使用散列表
     * @param jewels
     * @param stones
     * @return
     */
    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0 ;
        char[] j = jewels.toCharArray();
        Map<Character,Character> map = new HashMap<>() ;
        for (char c : j) {
            map.put(c,c) ;
        }
        char[] s = stones.toCharArray();
        for (char c : s) {
            if (map.get(c) != null)result++ ;
        }
        return result ;
    }

    /**
     * 数组
     * @param jewels
     * @param stones
     * @return
     */
    public static int numJewelsInStones1(String jewels, String stones) {
        int result = 0 ;
        int num[] =  new int[256] ;
        for (int x = 0 ; x < jewels.length()  ; x ++){
            num[jewels.charAt(x)] = 1 ;
        }
        for (int x = 0 ; x  < stones.length() ; x ++){
            result += num[stones.charAt(x)] ;
        }
        return result ;
    }

    /**
     * 两次循环
     * @param jewels
     * @param stones
     * @return
     */
    public static int numJewelsInStones2(String jewels, String stones) {
        int result = 0 ;
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        for (char c : s) {
            for (char c1 : j) {
                if (c == c1){
                    result ++ ;
                }
            }
        }
        return result ;
    }


}
