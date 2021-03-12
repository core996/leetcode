package L224_基本计算器;

import java.util.Stack;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-10 17:03
 */
public class Main {
    // todo 需要多刷
    public static void main(String[] args) {
        System.out.println(calculate1(" 2-1 + 2 "));
    }


    /**
     * 单栈实现
     * @param s
     * @return
     * @Date 2020-03-11 10:52
     */
    public static int calculate1(String s) {
        int result = 0 ;
        int sign = 1 ;
        int currentNumber = 0 ;
        Stack<Integer> stack = new Stack<>() ;
        char[] chars = s.toCharArray();
        for (int x = 0 ; x < chars.length ; x++){
            char tmp = chars[x] ;
            if (tmp == ' '){
                continue;
            }
            if (tmp >= '0' && tmp <= '9'){
                currentNumber = currentNumber*10 + (tmp - '0') ;
                if (x+1 != chars.length &&chars[x+1] >= '0' && chars[x+1] <= '9'){
                    continue;
                }
            }else if (tmp == '+' || tmp == '-'){
                currentNumber = 0 ;
                sign = tmp=='+'?1:-1 ;
            }else if (tmp == '(' ){
                stack.push(result) ;
                stack.push(sign) ;
                result = 0 ;
                sign = 1 ;
            }else if (tmp == ')'){
                sign = stack.pop() ;
                currentNumber = result ;
                result = stack.pop() ;
            }
            result = result+currentNumber*sign ;
        }
        return result ;

    }














    public static int calculate(String s) {
        int result = 0 ;
        int sign = 1 ;
        int currentNumber = 0 ;
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>() ;
        for (int x = 0 ; x < chars.length ; x++){
            char tmp = chars[x] ;
            if (tmp == ' '){
                continue;
            }
            if (tmp >= '0' && tmp <= '9'){
                currentNumber = currentNumber*10+(tmp-'0');
                if(x+1 != chars.length && chars[x+1] >= '0' && chars[x+1] <= '9'){
                    continue;
                }
            }else if (tmp == '+' || tmp == '-'){
                sign = tmp == '+' ? 1:-1 ;
            }else if (tmp == '('){
                stack.push(currentNumber);
                stack.push(sign) ;
                currentNumber = 0 ;
                sign = 1 ;
            }else if (tmp == ')'){
                sign= stack.pop();

                Integer ssign = stack.pop();


            }
            result += sign*currentNumber ;
        }
        return result ;
    }
}
