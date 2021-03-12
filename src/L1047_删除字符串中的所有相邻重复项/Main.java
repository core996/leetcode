package L1047_删除字符串中的所有相邻重复项;

import java.util.Stack;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-09 16:38
 */
public class Main {


    public static void main(String[] args) {
        System.out.println(removeDuplicates2("abbaca"));
//        char []a = new  char[2] ;
//        System.out.println(a[0]=='\u0000');


    }



    /**
     * StringBuilder
     * @param S
     * @return
     */
    public static String removeDuplicates2(String S) {
       StringBuilder s = new StringBuilder() ;
        char[] chars = S.toCharArray();
        int index = -1 ;
        for (int x = 0 ; x < S.length() ; x++){
            char aChar = chars[x];
            if (s.length() == 0){
                s.append(aChar) ;
                index++ ;
            }else {
                if (s.charAt(index) == chars[x]) {
                    s.deleteCharAt(index--) ;
                }else {
                    s.append(aChar) ;
                    index++ ;
                }
            }
        }
        return s.toString() ;
    }

    /**
     * 栈实现 Stack 实现
     * @param S
     * @return
     */
    public static String removeDuplicates1(String S) {
        Stack<Character> stack = new Stack<>() ;
        char[] chars = S.toCharArray();
        for (int x = 0 ; x < chars.length ;x ++){
            if (stack.size() == 0){
                stack.push(chars[x]) ;
            }else {
                Character pop = stack.pop();
                if (chars[x] != pop) {
                    stack.push(pop);
                    stack.push(chars[x]);
                }
            }
        }
        char a[] = new char[stack.size()] ;
        for (int x = a.length-1 ; x >=0 ; x--){
            a[x] = stack.pop() ;
        }
        return new String(a) ;
    }

    /**
     * 字符串截取方式
     * @param S
     * @return
     */
    public static String removeDuplicates(String S) {
        int  data  ;
        data = remove(S) ;
        while (data != -1 ){
            S = S.substring(0,data)+S.substring(data+1+1) ;
            data = remove(S) ;
        }
        return S ;
    }

    public static int remove(String s){
        int data = -1;
        char[] chars = s.toCharArray();
        for (int x = 0 ; x < chars.length-1 ;x++){
            if (chars[x] == chars[x+1]){
               data = x ;
               break;
            }
        }
        return data ;
    }
}
