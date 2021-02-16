import java.util.EmptyStackException;

class Node {
    int data;
    Node next;
}
public class LinkedListStack implements StackInterface {
    Node top;
    int size;

    LinkedListStack(){
        top = null;
        size = 0;
    }
    public void push(int a){
        Node aNewNode = new Node();
        aNewNode.data = a;

        if( size > 0){
            aNewNode.next = top;
            top = aNewNode;
        }else{
            top = aNewNode;
        }

    }

    public int pop(){
        int tmp = peek();
        top = top.next;
        return tmp;
    }

    public int peek(){
        if(size < 0 ){
            throw new EmptyStackException();
        }else{
            int tmp = top.data;
            return tmp;
        }
    }
}
