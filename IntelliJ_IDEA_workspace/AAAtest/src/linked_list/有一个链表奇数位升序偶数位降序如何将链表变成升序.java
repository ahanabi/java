package linked_list;

class OddIncreaseEvenDecrease {
    /**
     * 按照奇偶位拆分成两个链表
     *
     * @param head
     * @return
     */
    public static ListNode[] getLists(ListNode head) {
        ListNode head1 = null;
        ListNode head2 = null;

        ListNode cur1 = null;
        ListNode cur2 = null;
        int count = 1;//用来计数
        while (head != null) {
            if (count % 2 == 1) {
                if (cur1 != null) {
                    cur1.next = head;
                    cur1 = cur1.next;
                } else {
                    cur1 = head;
                    head1 = cur1;
                }
            } else {
                if (cur2 != null) {
                    cur2.next = head;
                    cur2 = cur2.next;
                } else {
                    cur2 = head;
                    head2 = cur2;
                }
            }
            head = head.next;
            count++;
        }
//跳出循环，要让最后两个末尾元素的下一个都指向null
        cur1.next = null;
        cur2.next = null;

        ListNode[] nodes = new ListNode[]{head1,
                head2};
        return nodes;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 合并两个有序链表
     *
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode CombineList(ListNode head1,
                                       ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 != null ? head1 :
                    head2;
        }
        ListNode head = head1.val < head2.val ? head1 : head2;
        ListNode cur1 = head == head1 ? head1 :
                head2;
        ListNode cur2 = head == head1 ? head2 :
                head1;
        ListNode pre = null;
        ListNode next = null;
        while (cur1 != null && cur2 !=
                null) {
            if (cur1.val <= cur2.val) {//这里一定要有=，否则一旦cur1的value和cur2的value相等的话，下面的pre.next会出现空指针异常
                pre = cur1;
                cur1 = cur1.next;
            } else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null ? cur2 : cur1;

        return head;
    }

}