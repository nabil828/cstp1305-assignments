import java.util.EmptyStackException;

class Node<T> {
    T data;
    Node next;
}
public class LinkedListStack<T> implements StackInterface<T> {
    Node top;
    int size;

    LinkedListStack(){
        top = null;
        size = 0;
    }
    public void push(T a){
        Node aNewNode = new Node();
        aNewNode.data =  a;

        if( size > 0){
            aNewNode.next = top;
            top = aNewNode;
        }else{ //wher the stack isempty
            top = aNewNode;
        }

    }

    public T pop(){
        T tmp = peek();
        top = top.next;
        return tmp;
    }

    public T peek(){
        if(size < 0 ){
            throw new EmptyStackException();
        }else{
            T tmp = (T)top.data;
            return tmp;
        }
    }
}
