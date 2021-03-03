import java.util.ArrayList;
import java.util.List;

public class LinkListStackClass<T> implements StackInterface<T> {

    Node top; // data member
    int size;
    Node first;

    LinkListStackClass() {
        size = 0;
    }

    public void push(T a) throws FullStackException { //member function O(n)
        if (size == LIMIT) {

            throw new FullStackException(); // a checked exception


        }
        Node aNewNode = new Node(a);

        if (size == 0) { // to if it has at least one item
            top = aNewNode;
            size++;
            first = top;
        } else {
            // may bt it is better to che2ck for duplicate here
            if (find(a) == -1) { // this means that `a` has a no valid location (1, 2, 3, ...), which means it does no exist already in the stack
                aNewNode.next = top;
                top = aNewNode;
                size++;
            }// if they do exist
        }

    }

    public int find(T a) { // O(n)
        // loop
        Node iterator = top;
        int location = size;
        while (iterator != null) {
            if (iterator.data == a)
                return location;
            location--;
            iterator = iterator.next;
        }

        return -1;
    }

    public T pop() { //member function // O(1)
        T tmp = (T) top.data;
        top = top.next;
        size--;
        return tmp;
    }

    public T peek() { //member function O(1)
        return (T) top.data;
    }


    public T peek1() {
        return (T) first.data; // O(1) when would it be O(n)?
    }


    public int get_size() {
        return size;
    }


    public static void main(String arg[]) {
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        node2.next = node1; // now this is a linked list?

        // Testing
        StackInterface<Integer> myFirstStack = new LinkListStackClass<Integer>();
        try {

            myFirstStack.push(10);
            myFirstStack.push(30);
            myFirstStack.push(20);
            myFirstStack.push(40);

            int tmp = myFirstStack.find(10); // should be 1

            // The next four pushes should be ignored
            myFirstStack.push(10);
            myFirstStack.push(10);
            myFirstStack.push(10);
            myFirstStack.push(10);

            System.out.println(myFirstStack.peek()); // now this should return 40
            System.out.println(myFirstStack.pop()); // 40
            System.out.println(myFirstStack.peek()); // now this should return 20
            System.out.println(myFirstStack.peek1()); // now this should return 10


        } catch (FullStackException e) {
            System.out.println(e.getMessage());
        }

    }
}
