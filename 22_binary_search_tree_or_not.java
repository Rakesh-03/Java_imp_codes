import java.util.Scanner;

public class Solution {
    public Node root;

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data <= node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return isBST(node.left, min, node.data) && isBST(node.right, node.data, max);
    }

    public boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {
            return true;
        }

        return false;
    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Solution tree = new Solution();
        Node root = null;
        while (t == 0) {
            int data = scan.nextInt();
            root = tree.insert(root, data);
        }

        boolean isBST = tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        boolean isBalanced = tree.isBalanced(root);

        if (isBST && isBalanced) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
