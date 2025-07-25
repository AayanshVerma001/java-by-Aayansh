//Create a simple Binary Tree in Java

//class Node {
  //  int data;
    //Node left, right;

 //   // Constructor
   // Node(int value) {
     //   data = value;
       // left = right = null;
   // }
//}

//class Main {
  //  public static void main(String[] args) {
    //    // Manually creating a tree
      //  Node root = new Node(10);
        //root.left = new Node(20);
        //root.right = new Node(30);
        //root.left.left = new Node(40);
        //root.left.right = new Node(50);

        //System.out.println("Root: " + root.data);
        //System.out.println("Left Child: " + root.left.data);
        //System.out.println("Right Child: " + root.right.data);
    //}
//}



//Inorder Traversal

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

 class Main {
    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}

