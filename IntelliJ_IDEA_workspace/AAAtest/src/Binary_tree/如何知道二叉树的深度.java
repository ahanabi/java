package Binary_tree;

import java.util.LinkedList;

class Deep {
    //递归实现1
    public int findDeep(Treenode root) {
        int deep = 0;
        if (root != null) {
            int lchilddeep = findDeep(root.left);
            int rchilddeep = findDeep(root.right);
            deep = lchilddeep > rchilddeep ? lchilddeep + 1 : rchilddeep + 1;
        }
        return deep;
    }

    //递归实现2
    public int findDeep1(Treenode root) {


        if (root == null) {
            return 0;
        } else {
            int lchilddeep = findDeep1(root.left);//求左子树的深度
            int rchilddeep = findDeep1(root.left);//求右子树的深度

            return lchilddeep > rchilddeep ? lchilddeep + 1 : rchilddeep + 1;//左子树和右子树深度较大的那个加一等于整个树的深度
        }
    }

    //非递归实现
    public int findDeep2(Treenode root) {
        if (root == null)
            return 0;

        Treenode current = null;
        LinkedList<Treenode> queue = new
                LinkedList<Treenode>();
        queue.offer(root);
        int cur, last;
        int level = 0;
        while (!queue.isEmpty()) {
            cur = 0;//记录本层已经遍历的节点个数
            last = queue.size();//当遍历完当前层以后，队列里元素全是下一层的元素，队列的长度是这一层的节点的个数
            while (cur < last)//当还没有遍历到本层最后一个节点时循环{
                current = queue.poll();//出队一个元素
            cur++;
            //把当前节点的左右节点入队（如果存在的话）
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
            level++;//每遍历完一层level+1
        }
        return level;
    }


    public static void main(String[] args) {
        Treenode root =new Treenode(5);
        Deep deep = new Deep();
        System.out.println(deep.findDeep(root));
        System.out.println(deep.findDeep1(root));
        System.out.println(deep.findDeep2(root));
    }
}