package L867_转置矩阵;

/**
 * @Description: 转置矩阵867
 * @Author: Wuxin
 * @Date: Create in  2021-02-25 17:31
 */
public class Main {
    public static void main(String[] args) {
        int [][] a = new int[][]{{1,2,3},{4,5,6}} ;
        transpose(a) ;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public static int[][] transpose(int[][] matrix) {

        int m = matrix.length ;
        int n = matrix[0].length ;
        int [][]result = new int[n][m] ;
        for (int x = 0 ; x < m ; x++){
            for(int y = 0 ; y < n ; y++){
                result[y][x] = matrix[x][y] ;
            }
        }
        return result ;
    }
}
