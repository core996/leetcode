package L54_螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-15 16:28
 */
public class Main {
    public static void main(String[] args) {
        int [][]data = {{1,2,3},{4,5,6},{7,8,9}} ;
        System.out.println(spiralOrder(data));
    }

    /**
     * 缩短边界方法
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>() ;
        int m = matrix.length ;
        int n = matrix[0].length ;
        int up = 0 ;
        int down = m-1 ;
        int left = 0 ;
        int right = n-1 ;
        int x = 0  ;
        int y = 0 ;
        int curd = 0 ; // 0 右，1，下 2 左 3 ，上
        int [][]dirs = {{0,1},{1,0},{0,-1},{-1,0}} ;
        while (result.size() != m*n){
            result.add(matrix[x][y]) ;
            if (curd == 0 && y==right ){
                curd = 1 ;
                up++ ;
            }else if (curd == 1 && x == down){
                curd = 2 ;
                right-- ;
            }else if (curd == 2 && y == left){
                curd = 3 ;
                down -- ;
            }else if (curd == 3 && x == up){
                left++ ;
                curd = 0 ;
            }
            x += dirs[curd][0] ;
            y += dirs[curd][1] ;
        }
        return result ;
    }
}
