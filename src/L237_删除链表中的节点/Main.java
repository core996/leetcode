package L237_删除链表中的节点;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-17 16:30
 */
public class Main {
    public static void main(String[] args) {

    }


    public void deleteNode(ListNode node) {
        node.val = node.next.val ;
        node.next = node.next.next ;
    }

    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }

}
