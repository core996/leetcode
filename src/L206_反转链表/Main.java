package L206_反转链表;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-18 17:16
 */
public class Main {
    public static void main(String[] args) {

    }


    /**
     * 双指针方法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode cur = null;
        ListNode pre = head ;
        while (pre != null){
            ListNode current = pre.next ;
            pre.next = cur ;
            cur = pre ;
            pre = current ;
        }
        return cur ;
    }

    /**
     * 双指针方法
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head.next == null){
            return head ;
        }
        ListNode current = reverseList1(head.next) ;
        head.next = current ;
        current.next=null ;
        return head ;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
