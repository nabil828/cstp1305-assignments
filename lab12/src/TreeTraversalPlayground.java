class Node{
    int data;
    public Node left;
    public Node right;
    Node (int x){
        this.data= x;
    }
}

class BinaryTree{
    Node root;

    // Traversal
    void InOrderTraversal(Node a){
        // Basic step
        if(a == null)
            return;
        // Inductive
        InOrderTraversal(a.left);
        System.out.print(a.data);
        InOrderTraversal(a.right);
    }


    void PreOrderTraversal(Node a){
        // Basic step
        if(a == null)
            return;
        // Inductive
        System.out.print(a.data);
        PreOrderTraversal(a.left);
        PreOrderTraversal(a.right);
    }



    void PostOrderTraversal(Node a){
        // Basic step
        if(a == null)
            return;
        // Inductive
        PostOrderTraversal(a.left);
        PostOrderTraversal(a.right);
        System.out.print(a.data);
    }

}

public class TreeTraversalPlayground {

    public static void main(String args[]){
        BinaryTree aTree = new BinaryTree();
        aTree.root = new Node(1);

        aTree.root.left = new Node(2);
        aTree.root.right= new Node(3);

        aTree.root.left.left = new Node(4);
        aTree.root.left.right = new Node(5);

        System.out.print("InOrderTraversal:" );
        aTree.InOrderTraversal(aTree.root);

        System.out.println( );

        System.out.print("PreOrderTraversal:" );
        aTree.PreOrderTraversal(aTree.root);

        System.out.println( );

        System.out.print("PostOrderTraversal:" );
        aTree.PostOrderTraversal(aTree.root);
    }
}
