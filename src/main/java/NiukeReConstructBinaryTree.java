class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class NiukeReConstructBinaryTree {

    private TreeNode deal(int[] pre, int[] in, int start1, int start2, int len) {
        if (len == 0) {
            return null;
        }
        int rootVal = pre[start1];
        TreeNode root = new TreeNode(rootVal);
        int s1 = start1+1;
        int s2 = start2;
        int sublen = 0;
        while(in[s2] != rootVal){
            sublen++;
            s2++;
        }
        root.left = deal(pre, in, s1, start2, sublen);
        s2++;
        int rightsublen = len - sublen - 1;
        root.right = deal(pre, in, s1+sublen, s2, rightsublen);
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        int len = pre.length;
        return deal(pre, in, 0, 0, len);
    }
}
