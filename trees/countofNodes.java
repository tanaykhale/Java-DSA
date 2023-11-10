public class countofNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public static Node buildtree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);
        return newNode;
    }

    public static int count(Node root) {
        if (root == null)
            return 0;
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    public static int sumofNodes(Node root) {
        if (root == null)
            return 0;
        int left = sumofNodes(root.left);
        int right = sumofNodes(root.right);
        return left + right + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        countofNodes tree = new countofNodes();
        Node root = tree.buildtree(nodes);
        // int count = count(root);
        // System.out.println(count);
        System.out.println(sumofNodes(root));

    }
}
