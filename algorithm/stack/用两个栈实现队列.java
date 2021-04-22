package stack;

import java.util.Stack;

/**
 * @author Ahanabi
 * @create 2020-08-01 22:57
 * <p>
 * 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。队列中的
 * 元素为int类型。
 * 思路：一个栈压入元素，而另一个栈作为缓冲，将栈1的元素出栈后压入栈2
 * 中。也可以将栈1中的最后一个元素直接出栈，而不用压入栈2中再出栈。
 */


public class 用两个栈实现队列 {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(1);
        solution.push(1);
        solution.push(2135435);
        System.out.println(solution.pop());
    }

}

class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    //入栈，时间复杂度：O(1)，空间复杂度：O(n)
    public void push(int node) {
        stack1.push(node);
    }
    //出栈，时间（摊还）复杂度：O(1)，空间复杂度：O(1)
    public int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("栈为空！");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
