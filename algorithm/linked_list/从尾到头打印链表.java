package linked_list;

import java.util.ArrayList;
import java.util.Stack;

class PrintListFromTailToHead {
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }

    static ArrayList<Integer> list = new ArrayList();

    public static ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead3(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}


