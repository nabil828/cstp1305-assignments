import java.util.Stack;

class Node{
    int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data = data;
    }
}
class BinaryTree{
    Node root;
    void PreOrderTraversal(Node node){
        if (node == null)
            return;
        System.out.print(node.data);
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }
    void InOrderTraversal(Node node){
        if (node == null)
            return;
        InOrderTraversal(node.left);
        System.out.print(node.data);
        InOrderTraversal(node.right);
    }

    void PostOrderTraversal(Node node){
        if (node == null)
            return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data);

    }

    // Book p 696
    // https://www.educative.io/edpresso/how-to-perform-an-iterative-inorder-traversal-of-a-binary-tree
    void InOrderTraversalIterative(Node node){
        Stack<Node> aStack = new Stack<>(); //1
        Node current = root; //2

        
        while(current != null || !aStack.empty()){ //5
            if(current != null) { // 3
                aStack.push(current);
                current = current.left;
            }else
            { //4
                current =  aStack.peek();
                aStack.pop();
                System.out.print(current.data);
                current = current.right;
            }
        }
    }

    // p 698
    // https://www.geeksforgeeks.org/iterative-preorder-traversal/
    void PreOrderTraversalIterative(Node node){
        Stack<Node> aStack = new Stack<>(); //1
        Node current = root;
        aStack.push(root);

        while(!(aStack.empty())){ //2
                Node tmpNode = aStack.pop(); //2.a
                System.out.print(tmpNode.data); //
                if(tmpNode.right != null)
                    aStack.push(tmpNode.right);
                if(tmpNode.left != null)
                    aStack.push(tmpNode.left);
        }
    }

    // p 698
    // https://www.geeksforgeeks.org/iterative-postorder-traversal-using-stack/
    void PostOrderTraversalIterative(Node node){
        Stack<Node> aStack = new Stack<>(); //1
        Node current = root;
        aStack.push(root);
        Stack<Node> tmpStack = new Stack<>();

        while(!(aStack.isEmpty())){
            Node tmpNode = aStack.pop();
            if(tmpNode.left != null)
                aStack.push(tmpNode.left);
            if(tmpNode.right != null)
                aStack.push(tmpNode.right);
            tmpStack.add(tmpNode);
//            System.out.print(tmpNode.data);
        }

        while(!tmpStack.isEmpty()){
            System.out.print(tmpStack.pop().data);
        }
    }
}



public class TreeTraversal {

    public static void main (String args[]){
        BinaryTree aTree = new BinaryTree();
        aTree.root = new Node(1);
        aTree.root.left = new Node(2);
        aTree.root.right = new Node(3);
        aTree.root.left.left = new Node(4);
        aTree.root.left.right = new Node(5);

        aTree.root.right.left = new Node(6);
        aTree.root.right.right = new Node(7);

        System.out.print("PreOrderTraversal: ");
        aTree.PreOrderTraversal(aTree.root);

        System.out.println();

        System.out.print("InOrderTraversal: ");
        aTree.InOrderTraversal(aTree.root);

        System.out.println();

        System.out.print("PostOrderTraversal: ");
        aTree.PostOrderTraversal(aTree.root);

        System.out.println();

        System.out.print("InOrderTraversalIterative: ");
        aTree.InOrderTraversalIterative(aTree.root);

        System.out.println();
        System.out.print("PreOrderTraversalIterative: ");
        aTree.PreOrderTraversalIterative(aTree.root);


        System.out.println();
        System.out.print("PostOrderTraversalIterative: ");
        aTree.PostOrderTraversalIterative(aTree.root);

    }

}
