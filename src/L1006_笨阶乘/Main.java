package L1006_笨阶乘;

import java.util.Stack;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-04-01 14:54
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(clumsy1(10));
    }

    /**
     * 找规律，以数学方式解决问题
     * @param N
     * @return
     */
    public int clumsy3(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 2;
        } else if (N == 3) {
            return 6;
        } else if (N == 4) {
            return 7;
        }

        if (N % 4 == 0) {
            return N + 1;
        } else if (N % 4 <= 2) {
            return N + 2;
        } else {
            return N - 1;
        }
    }



    /**
     * 栈计算
     * @param N
     * @return
     */
    public  static int clumsy1(int N) {
        int result = 0 ;
        char signs[] = {'*','/','+','-'};
        char sign  ;
        int num = N ;
        Stack<Integer> stack = new Stack<>() ;
        stack.push(N) ;
        for (int x = 0 ; x <num -1; x++){
            sign = signs[x%4] ;
            int currentNumber = --N ;
            if ('+' == sign){
                stack.push(currentNumber) ;
            }else if ('-' == sign){
                stack.push(-currentNumber) ;
            }else if ('*' == sign){
               stack.push(stack.pop()*currentNumber);
            }else if ('/' == sign){
                stack.push(stack.pop()/currentNumber);
            }
        }
        while (!stack.isEmpty()){
            result+=stack.pop() ;
        }
        return result ;
    }

    public static int clumsy(int N) {
        String sign[] = {"*","/","+","-"};
        StringBuilder s = new StringBuilder() ;
        int num = N ;
        for (int x = 0 ; x <num ; x++){
            s.append(N--).append(sign[x%4]) ;
        }
        s.deleteCharAt(s.length()-1) ;
        return calculate(s.toString()) ;
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
