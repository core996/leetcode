package L354_俄罗斯套娃;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-04 17:10
 */
public class Main {
    public static void main(String[] args) {
        int data[][] = {
                {3, 0},
                {5, 6},
                {1, 2},
                {4, 1},
                {1, 0}} ;
        int a [] = {2,3,4,4,5,5,6};
       insertionSort(data);
//       insertionSort1(data);
        System.out.println();
        System.out.println();
    }


    public static int maxEnvelopes(int[][] envelopes) {
        int result = 0 ;
        return result ;
    }



    // 插入排序
    public static void insertionSort(int [][]data){
        for (int i = 1 ; i < data.length ;++i){
            int valueData[] = data[i];
            int value = data[i][0] ;
            int j = i-1 ;
            for (;j >= 0 ; --j){
                if (data[j][0] > value){
                    data[j+1] = data[j] ;
                }
                else if (data[j][0] == value) {
                    data[j][0] = -1 ;
                }else {
                    break;
                }
            }
            data[j+1] = valueData ;
        }
    }

    // 插入排序
    public static void insertionSort1(int [][]data){
        for (int i = 1 ; i < data.length ;++i){
            int value = data[i][1] ;
            int j = i-1 ;
            for (;j >= 0 ; --j){
                if (data[j][1] > value){
                    data[j+1] = data[j] ;
                }
                else if (data[j][1] == value) {
                    data[j+1][1] = -1 ;
                }else {
                    break;
                }
            }
            data[j+1] = data[i] ;
        }
    }
}
