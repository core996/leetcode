package L341_扁平化嵌套列表迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-23 18:19
 */
public class Main {
    // todo 多加练习


    // This is the interface that allows for creating nested lists.
    // You should not implement it, or speculate about its implementation
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }


    /**
     * 在初始化的时候将数据摊平
     */
    public class NestedIterator implements Iterator<Integer> {

        private List<Integer> list = new ArrayList<>();
        private Iterator<Integer> iterator;

        public NestedIterator(List<NestedInteger> nestedList) {
            add(nestedList);
            iterator = list.iterator();
        }

        private void add(List<NestedInteger> nestedList) {
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    list.add(nestedInteger.getInteger());
                } else {
                    add(nestedInteger.getList());
                }
            }

        }

        @Override
        public Integer next() {
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }
    }



    /**
     * 使用栈在迭代的时候摊平
     */

    public class NestedIterator2 implements Iterator<Integer> {

        Stack<NestedInteger> stack = new Stack<>() ;

        public NestedIterator2(List<NestedInteger> nestedList) {
           for (int x = nestedList.size() - 1 ; x >=0 ;x--){
               stack.push(nestedList.get(x)) ;
           }
        }


        @Override
        public Integer next() {
            return stack.pop().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()){
                NestedInteger peek = stack.peek();
                if (peek.isInteger()){
                    return true ;
                }
                stack.pop() ;
                List<NestedInteger> list = peek.getList();
                for (int x = list.size() -1 ; x >=0 ; x--){
                    stack.push(list.get(x)) ;
                }
            }
            return false ;
        }
    }

}
