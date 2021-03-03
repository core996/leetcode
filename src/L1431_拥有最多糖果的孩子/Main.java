package L1431_拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-02-26 17:56
 */
public class Main {
    public static void main(String[] args) {

    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>() ;
        int max = 0 ;
        for (int candy : candies) {
            if (candy >= max)
                max = candy;
        }
        for (int candy : candies) {
            result.add(candy+extraCandies >=max);
        }
        return result ;
    }
}
