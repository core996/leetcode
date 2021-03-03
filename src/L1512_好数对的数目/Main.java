package L1512_好数对的数目;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 好数对的数目1512
 * @Author: Wuxin
 * @Date: Create in  2021-02-24 18:00
 */
public class Main {
    public static void main(String[] args) {

    }


    /**
     * 暴力 n^2
     * @param nums
     * @return
     */
    public static int numIdenticalPairs(int[] nums) {
        int num = 0 ;
        for(int x = 0 ; x < nums.length ; x++){
            for (int j = x + 1 ; j < nums.length ; j++){
                if (nums[x] == nums[j]){
                    num ++ ;
                }
            }
        }
        return num;
    }


    /**
     * 散列表 n
     * @param nums
     * @return
     */
    public static int numIdenticalPairs1(int[] nums) {
        Map<Integer ,Integer> map = new HashMap<>() ;
        int num = 0 ;
        for (int i : nums) {
            Integer integer = map.getOrDefault(i,0);
            map.put(i,integer+1) ;
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            num+=value*(value-1)/2 ;
        }
        return num;
    }

    /**
     *  数组 n
     * @param nums
     * @return
     */
    public static int numIdenticalPairs2(int[] nums) {
        int num = 0 ;
        int []tmp = new int[100] ;
        for (int i : nums) {
            num += tmp[i-1];
            tmp[i-1]++ ;
        }
        return num;
    }
}
