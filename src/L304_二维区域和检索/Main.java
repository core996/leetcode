package L304_二维区域和检索;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-02 17:19
 */
public class Main {

    public static void main(String[] args) {
        int data[][] = {
                {3, 0, 1, 4, 2},
        {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                    {1, 0, 3, 0, 5}} ;

        NumMatrix1 numMatrix1 = new NumMatrix1(data);
        System.out.println(numMatrix1.sumRegion(2,1,4,3));
    }

    static class NumMatrix {

        int data[][] ;

        public NumMatrix(int[][] matrix) {
            this.data = matrix ;
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int result = 0 ;
            for (int x = 0 ; x < data.length ; x++){
                for (int y = 0 ; y < data[x].length;y++){
                    if (row1<=x && x <= row2 && col1 <= y&& y<=col2 ){
                        result+=data[x][y] ;
                    }
                }
            }
            return result ;
        }
    }


    static class NumMatrix1 {

        int sum[][] ;

        public NumMatrix1(int[][] matrix) {
            int length = matrix.length;
            int length2 = matrix[0].length ;
            if (length>0) {
                sum = new int[length + 1][length2 + 1];
                for (int x = 1; x <= matrix.length; x++) {
                    for (int y = 1; y <= matrix[x-1].length; y++) {
                        sum[x][y] = matrix[x - 1][y - 1]  + sum[x][y - 1] ;
                        if (x>=2){
                           while (y != 1){
                               sum[x][y] += sum[x][y--] ;
                           }
                        }
                    }
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {

            return sum[row2][col2] - sum[row2][col1-1] - sum[row1-1][col2]+sum[row1-1][col1-1] ;
        }
    }

}
