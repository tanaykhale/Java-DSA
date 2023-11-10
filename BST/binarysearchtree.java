public class binarysearchtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key)
            return search(root.left, key);
        else if (root.data == key)
            return true;
        else
            return search(root.right, key);
    }

    static Node insert(Node root, int values) {
        if (root == null) {
            root = new Node(values);
            return root;
        }
        if (root.data > values) {
            root.left = insert(root.left, values);
        } else {
            root.right = insert(root.right, values);
        }
        return root;
    }

    static void inorder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inorder(rootNode.right);
    }

    public static Node delete(Node root, int val) {
        if (root == null)
            return root;
        if (root.data > val)
            root.left = delete(root.right, val);
        else if (root.data < val)
            root.right = delete(root.left, val);
        else {// root.data==val;
              // case 1
            if (root.left == null && root.right == null)
                return null;
            // case 2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        delete(root, 3);
        inorder(root);
        // if (search(root, 3))
        // System.out.println("found");
        // else
        // System.out.println("not found");
    }
}