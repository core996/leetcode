package L61_旋转链表;
/*
 *
 * @Author wuxin
 * @Date 2021/3/27 15:00
 * @Description
 *
 */

public class Main {
    public static void main(String[] args) {

    }


 /**
  * 链表链接成环的方法
  * @param head
  * @param k
  * @return
  */
 public ListNode rotateRight(ListNode head, int k) {
     if (k == 0 || head == null || head.next == null) {
      return head;
     }
        ListNode tail = head;
        int num = 1;
        while (tail.next != null) {
            num++;
            tail = tail.next;
        }
        int add = num - k%num ;
        tail.next = head ;
        while (add-- >0){
           tail= tail.next ;
        }
        ListNode result = tail.next ;
        tail.next = null ;
        return result ;


    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
