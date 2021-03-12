package L227_基本计算器2;

import java.util.Stack;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-11 17:57
 */
public class Main {
    // todo 多次练习
    public static void main(String[] args) {
        System.out.println(calculate(" 2-1 + 2 *2"));
    }


    /**
     * 单栈实现
     * @param s
     * @return
     */
    public static int calculate(String s) {

        int result = 0 ;
        char sign = '+';
        int currentNumber =0;

        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>() ;
        for (int x = 0 ; x < chars.length ; x++){
            char aChar = chars[x];
            if(Character.isDigit(aChar)){
                currentNumber = currentNumber*10+aChar-'0' ;
            }
            if (!Character.isDigit(aChar) && aChar !=' ' || x+1==chars.length){
                if ('+' == sign){
                    stack.push(currentNumber) ;
                }else if ('-' == sign){
                    stack.push(-currentNumber) ;
                }else if ('*' == sign){
                    stack.push(stack.pop() * currentNumber) ;
                }else if ('/' == sign){
                    stack.push(stack.pop() /currentNumber) ;
                }
                sign = aChar ;
                currentNumber=0;
            }
        }
        while (!stack.isEmpty()){
            result+=stack.pop() ;
        }
        return  result ;
    }
}
