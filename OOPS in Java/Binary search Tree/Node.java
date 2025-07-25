//Java Code to create a BST

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    // Insert node in BST
    Node insert(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else
            node.right = insert(node.right, value);

        return node;
    }

    // Inorder Traversal (gives sorted output)
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);  // Should print: 20 30 40 50 60 70 80
    }
}