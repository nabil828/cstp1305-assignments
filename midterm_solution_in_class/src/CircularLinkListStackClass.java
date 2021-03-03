// we need this to create a linked list
class Node<T> {
    T data; //data member
    Node next; //data member

    Node(T x) { // constuctor
        data = x;
        next = null;
    }
}

// ADT:
// IT is a Stack ADT using circular linked list
public class CircularLinkListStackClass<T> implements StackInterface<T> { // this is our ADT
    Node front; // data member
    Node back;
    int size;
    Node first;

    CircularLinkListStackClass() {
        size = 0;
    }


    public void push(T a) { //member function O(n)
        Node aNewNode = new Node(a);

        if (size == 0) { // to if it has at least one item
            front = aNewNode;
            back = aNewNode;
            size++;
        } else {
            // may bt it is better to che2ck for duplicate here
            if (find(a) == -1) { // this means that `a` has a no valid location (1, 2, 3, ...), which means it does no exist already in the stack
                aNewNode.next = front;
                front = aNewNode;
                back.next = front;
                size++;
            }// if they do exist
        }

    }

    public int find(T a) { // O(n)
        // loop
        Node iterator = front;
        int location = size;
        while (iterator != back) {
            if (iterator.data == a)
                return location;
            location--;
            iterator = iterator.next;
        }
        // I still to have to check the back node as well
        if (back.data == a)
            return location;

        return -1;
    }

    public T pop() { //member function // O(1)
        T tmp = (T) front.data;
        front = front.next;
        back.next = front;
        size--;
        return tmp;
    }

    public T peek() { //member function O(1)
        return (T) front.data;
    }


    public T peek1() {
        return (T) back.data; // O(1) when would it be O(n)?
    }

    public int get_size() {
        return size;
    }

    public static void main(String arg[]) {
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        node2.next = node1; // now this is a linked list?

        // Testing
        StackInterface<Integer> myFirstStack = new CircularLinkListStackClass<Integer>();

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


        StackInterface<Character> anotherStack = new CircularLinkListStackClass<>();
        anotherStack.push('c');
        anotherStack.push('a');
        anotherStack.push('a'); // should be ignore
        System.out.println(anotherStack.get_size());//2

    }
}
