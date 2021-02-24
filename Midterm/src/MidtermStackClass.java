class Node<T>{
    T data;
    Node next;

}
class FullStackException extends Exception{
    public FullStackException(){
        super("You can't push the item because ..");
    }
}
class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("You can't pop or peek on an Empty stack because ..");
    }
}


public class MidtermStackClass<T> implements MidtermStackInterface<T>{
    Node front;
    Node back;
    int LIMIT = 4;
    int size;
    MidtermStackClass(){
        front = null;
    }
    boolean itemfound(T a){
        Node iterartor = front;
        while(iterartor!= back){
            T tmp =(T)iterartor.data;
            if(tmp == a)
                return true;
            iterartor = iterartor.next;
        }
        return false;
    }

    public void push(T a) throws FullStackException{
        if (size == LIMIT)
            throw new FullStackException();
        else {
            if(!itemfound(a)){
                Node newNode = new Node();
                newNode.data = a;
                if (front == null) {
                    front = newNode;
                    back = newNode;
                    newNode.next = front;
                } else {
                    newNode.next = front;
                    front = newNode;
                    back.next = newNode;
                }
                size++;
            }
        }
    }

    public T pop() throws EmptyStackException{
        T tmp = peek();
        if(front == back){
            front = null;
            back = null;
        }
        else{
            front = front.next;
            back.next = front;
            size--;
        }
        return tmp;
    }
    public T peek() throws EmptyStackException{
        if (size == 0)
            throw new EmptyStackException();
        T tmp = (T)front.data;
        return tmp;
    }
    public T peek1() throws EmptyStackException{
        if (size == 0)
            throw new EmptyStackException();
        T tmp = (T)back.data;
        return tmp;
    }


    public int getsize(){
        return  size;
    }

    public int find (T x){
        Node iterartor = front;
        if(front == back && front.data == x)
            return 1;

        int counter = 0;
        while(iterartor!= back){
            T tmp =(T)iterartor.data;
            if(tmp == x)
                return size - counter;
            iterartor = iterartor.next; counter++;
        }
        T tmp =(T)iterartor.data;
        if(tmp == x)
            return size - counter;


        return -1;
    }
    public static void main(String args[])
    {
        MidtermStackInterface s = new MidtermStackClass();
        try {
            System.out.println(s.peek()); // empty exception
        }
        catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }

        try{

            s.push(7);
            s.push(6);
            s.push(1);
            s.push(100);
            s.pop();

            System.out.println(s.peek()); // should be 1
            System.out.println(s.peek1()); // should be 7
            s.push(100); // should ignore
            System.out.println(s.getsize()); // should be 1
            s.push(5); // full exception

        }
        catch (FullStackException e){
            System.out.println(e.getMessage());
        }
        catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }


        System.out.println("finding ... "); //2
        System.out.println(s.find(66)); //-1

        System.out.println(s.find(7)); //1

        System.out.println(s.find(6)); //2


        System.out.println(s.find(100)); // 4

    }

}
