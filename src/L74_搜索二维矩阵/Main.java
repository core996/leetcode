package L74_搜索二维矩阵;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-30 17:03
 */
public class Main {

    public static void main(String[] args) {
        int []data = new int[]{1} ;
        System.out.println(binarySearch(data,1,0,data.length));
    }

    /**
     * 二分法寻找
     * @info 中等题，执行用时 0ms ，自己做出来的
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;
        int n = matrix[0].length -1;
        for (int i = 0 ; i < m ; i++){
            if (matrix[i][0] <= target && matrix[i][n] >= target){
                return binarySearch(matrix[i],target,0,matrix[i].length) ;
            }
        }
        return false;
    }


    public static boolean binarySearch(int []data ,int target,int left , int right){
        if (left == right) return false ;
        int mid = (left+right)/2 ;
        if (target == data[mid]){
            return true ;
        }else if (target > data[mid]){
            return binarySearch(data,target,mid+1,right);
        }else {
            return binarySearch(data,target,0,mid) ;
        }
    }
}
