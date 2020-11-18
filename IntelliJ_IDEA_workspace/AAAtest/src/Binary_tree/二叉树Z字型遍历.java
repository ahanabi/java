package Binary_tree;

/**
 * @author Ahanabi
 * @create 2020-08-03 22:16
 */

/*
class Z {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> l = new LinkedList<TreeNode>();
        boolean flag = true;
        if (root == null) {
            return res;
        }
        l.add(root);
        while (l.size() != 0) {
            flag = !flag;
            int size = l.size();
            List<Integer> list = new
                    ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = l.remove();
                list.add(temp.val);
                if (temp.left != null)
                    l.add(temp.left);
                if (temp.right != null)
                    l.add(temp.right);
            }
            if (flag) {
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }

}*/
