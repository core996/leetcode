package L832_翻转图像;

/**
 * @Description: 翻转图像832
 * @Author: Wuxin
 * @Date: Create in  2021-02-24 16:06
 */
public class Main {
    public static void main(String[] args) {
        int[][] A ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}} ;


        System.out.println(flipAndInvertImage1(A));
    }

    /**
     * 暴力解法 2n^2
     * @param A
     * @return
     */
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int x = 0 ; x < A.length ;x++){
            for (int y = 0 ; y < A[x].length ; y++){
                    A[x][y] =  A[x][y]^1;
            }

            for (int y = 0 ; y < A[x].length/2 ; y++){
               int tmp = A[x][y] ;
               A[x][y] = A[x][A[x].length-1-y] ;
                A[x][A[x].length-1-y] = tmp ;
            }

        }
        return A ;
    }


    /**
     * n^2
     * @param A
     * @return
     */
    public static int[][] flipAndInvertImage1(int[][] A) {
        for (int x = 0 ; x < A.length ;x++){
            for (int y = 0 ; y < A[x].length/2 ; y++){
                int tmp = A[x][y];
                A[x][y] = A[x][A[x].length - 1 - y];
                A[x][A[x].length - 1 - y] = tmp;
                A[x][y] = A[x][y]^1;
                if (A[x].length-1-y != y){
                    A[x][A[x].length-1-y] = A[x][A[x].length-1-y] ^1;
                }
            }
            if (A[x].length%2 != 0){
                A[x][A[x].length/2] = A[x][A[x].length/2]^1 ;
            }

        }
        return A ;
    }


    /**
     * 双指针，头尾 。 n^2
     * @param A
     * @return
     */
    public static int[][] flipAndInvertImage3(int[][] A) {
       int length = A.length ;
       for(int x = 0 ; x < length ; x++){
           for (int y = 0 , end = A[x].length-1 ; y <= end ; y++,end--){
               int tmp = A[x][y]^1 ;
               A[x][y] = A[x][end]^1 ;
               A[x][end] = tmp ;
           }
       }
       return A ;
    }
}
