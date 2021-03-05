package L232_用栈实现队列;

import java.util.Stack;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-05 16:58
 */
public class Main {


    public static void main(String[] args) {
        MyQueue1 myQueue = new MyQueue1();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.pop());
        System.out.println();
    }


    /**
     * 数组实现
     */
    static class MyQueue {

        int []data ;
        int index = 0 ;

        /** Initialize your data structure here. */
        public MyQueue() {
            data = new int[101] ;
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            int tmp = index ;
            for (; tmp>=0 ;tmp--){
                data[tmp+1] = data[tmp] ;
            }
            data[0] = x ;
            index++ ;
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return data[index--] ;
        }

        /** Get the front element. */
        public int peek() {
            return data[index] ;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return index == 0 ;
        }
    }



    /**
     * 栈实现， 进入栈只负责push ，弹出栈负责pop 和peek
     */
    static class MyQueue1 {

        Stack<Integer> stackIn ;
        Stack<Integer> stackOut ;

        /** Initialize your data structure here. */
        public MyQueue1() {
            stackIn = new Stack<>() ;
            stackOut = new Stack<>() ;
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stackIn.push(x) ;
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
           if (stackOut.empty()){
               while (!stackIn.empty()) {
                   stackOut.push(stackIn.pop());
               }
           }
           return stackOut.pop() ;
        }

        /** Get the front element. */
        public int peek() {
            if (stackOut.empty()){
                while (!stackIn.empty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            return stackOut.peek() ;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stackIn.empty() && stackOut.empty() ;
        }
    }
}
