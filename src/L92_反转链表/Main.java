package L92_反转链表;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-18 16:48
 */
public class Main {

    public static void main(String[] args) {

    }


    public ListNode reverseBetween1(ListNode head, int left, int right) {
        int num = 1 ;
        ListNode currentNode = head ;
        ListNode leftNode = null ;
        ListNode rightNode = null ;
        while (currentNode.next != null){
            if (num+1 == right){
                rightNode = currentNode ;
            }
            if (num+1 == left){
                leftNode = currentNode ;
            }
            currentNode = currentNode.next ;
        }
        currentNode = head ;
        ListNode cur = leftNode ;
        ListNode pre = null ;
        num = 1 ;
        while (currentNode.next != null){
            if (num>=left && num<=right){
            }
        }
        return head ;
    }

    /**
     * 直接修改链表内的值
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode currentNode = head ;
        if (left == right) return head ;
        int []vals = new int[right-left+1] ;
        int num = 1 ;
        int index = 0 ;
        while (num<= right){
            if (num >= left){
                vals[index++] = currentNode.val ;
            }
            currentNode = currentNode.next ;
            num++ ;
        }
        int length = vals.length-1 ;
        num = 1 ;
        currentNode = head ;
        while (num<= right){
            if (num >= left){
                 currentNode.val =vals[length--] ;
            }
            currentNode = currentNode.next ;
            num++ ;
        }
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
