package L83_删除排序链表中的重复元素;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-26 16:25
 */
public class Main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head ;
        while (curr != null){
                if (curr.next != null &&curr.val == curr.next.val  ) {
                    curr.next = curr.next.next;
                }else {
                    curr = curr.next;
                }
        }
        return head ;
    }


}
