// we need this to create a linked list
class Node{
    int data; //data member
    Node next; //data memeber

    Node(int x){ // constuctor
        data = x;
        next = null;
    }
}


public class MidtermStackClass { // this is our ADT
    Node top; // data member
    int size;

    MidtermStackClass(){
        size = 0;
    }
    void push(int a){ //member function
        Node aNewNode = new Node(a);

        if(size == 0){ // to if it has at least one item
            top = aNewNode;
            size++;
        }else{
            // may bt it is better to che2ck for duplicate here
            if(find(a) == -1 ) { // this means that `a` has a no valid location (1, 2, 3, ...), which means it does no exist already in the stack
                aNewNode.next = top;
                top = aNewNode;
                size++;
            }// if they do exist
        }
  }

     public int find(int a) {
        // loop
        Node iterator = top;
        int location = size;
        while(iterator != null){
            if(iterator.data == a)
                return location;
            location--;
            iterator = iterator.next;
        }

        return -1;
    }

    int pop(){ //member function
        int tmp = top.data;
        top = top.next;
        size--;
        return tmp;
    }
    int peek(){ //member function
        return top.data;
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

    }
}
