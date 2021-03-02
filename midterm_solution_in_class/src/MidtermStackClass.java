// we need this to create a linked list
class Node{
    int data; //data member
    Node next; //data memeber

    Node(int x){ // constuctor
        data = x;
        next = null;
    }
}

// ADT:
// IT is a Stack ADT using circular linked list
public class MidtermStackClass implements StackInterface{ // this is our ADT
    Node front; // data member
    Node back;
    int size;
    Node first;

    MidtermStackClass(){
        size = 0;
    }


    public void push(int a){ //member function O(n)
        Node aNewNode = new Node(a);

        if(size == 0){ // to if it has at least one item
            front = aNewNode;
            back = aNewNode;
            size++;
        }else{
            // may bt it is better to che2ck for duplicate here
            if(find(a) == -1 ) { // this means that `a` has a no valid location (1, 2, 3, ...), which means it does no exist already in the stack
                aNewNode.next = front;
                front = aNewNode;
                back.next = front;
                size++;
            }// if they do exist
        }

  }

     public int find(int a) { // O(n)
        // loop
        Node iterator = front;
        int location = size;
        while(iterator != back){
            if(iterator.data == a)
                return location;
            location--;
            iterator = iterator.next;
        }
        // I still to have to check the back node as well
         if(back.data == a)
             return location;

        return -1;
    }

    public int pop(){ //member function // O(1)
        int tmp = front.data;
        front = front.next;
        back.next = front;
        size--;
        return tmp;
    }
    public int peek(){ //member function O(1)
        return front.data;
    }


    public int peek1(){
        return back.data; // O(1) when would it be O(n)?
    }


    public static void main(String arg[]){
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        node2.next = node1; // now this is a linked list?

        // Testing
        MidtermStackClass myFirstStack = new MidtermStackClass();

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

    }
}
