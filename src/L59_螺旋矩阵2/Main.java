package L59_螺旋矩阵2;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-16 16:21
 */
public class Main {
    public static void main(String[] args) {
        generateMatrix(3);
        System.out.println();
    }

    /**
     * 缩短边界方法
     * @param n
     * @return
     */
    public static int[][] generateMatrix(int n) {
        int result[][] = new int[n][n] ;
        int x = 0 ;
        int y = 0 ;
        int up = 0 ;
        int down = n-1 ;
        int left = 0 ;
        int right = n-1 ;
        int curd = 0 ; // 0右 1下 2左 3上
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}} ;
        for (int i = 1 ; i <= n*n ; i++){
            result[x][y] = i ;
            if (curd == 0 && y==right ){
                up++ ;
                curd = 1 ;
            }else if (curd == 1 && x == down){
                right -- ;
                curd = 2 ;
            }else if (curd == 2 && y == left){
                down -- ;
                curd = 3 ;
            }else if (curd == 3 && x == up){
                curd = 0;
                left++ ;
            }
            x += dirs[curd][0] ;
            y += dirs[curd][1] ;
        }
        return result ;
    }
}
