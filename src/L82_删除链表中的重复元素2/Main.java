package L82_删除链表中的重复元素2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-25 17:55
 */
public class Main {

    // todo 需要改进方法
    public static void main(String[] args) {
        ListNode a = new ListNode(1) ;
        a.next=new ListNode(2);
        a.next.next = new ListNode(3) ;
        a.next.next.next= new ListNode(3) ;
        a.next.next.next.next= new ListNode(4) ;
        a.next.next.next.next.next= new ListNode(4) ;
        a.next.next.next.next.next.next= new ListNode(5) ;
        deleteDuplicates(a);

    }

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    /**
     * 找出相同的元素然后重新组建链表
     * @param head
     * @return
     */

    public  static ListNode deleteDuplicates(ListNode head) {
          List<Integer> values = new ArrayList<>() ;
          List<Integer> same = new ArrayList<>() ;
          ListNode curr = head ;
          while (curr!=null){
              int val = curr.val;
              if (values.contains(val)){
                  same.add(val) ;
              }
              values.add(curr.val) ;
              curr = curr.next;
          }
        Iterator<Integer> iterator = values.iterator();
          while (iterator.hasNext()){
              Integer next = iterator.next();
              if (same.contains(next)){
                  iterator.remove();
              }
          }

        if (values.size() == 0){
            return null;
        }
        ListNode newNode = new ListNode();
        ListNode currentNode = newNode ;

        for (int x = 0 ; x < values.size() ; x++){
            currentNode.val=values.get(x) ;
            if (x != values.size()-1){
                currentNode.next = new ListNode() ;
                currentNode = currentNode.next;
            }
        }
        return newNode;

    }


}
