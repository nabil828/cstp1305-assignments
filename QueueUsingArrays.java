public class QueueUsingArrays {
    int []arr = new int[6]; // a Data member
    int size = 0; // it is num in the slides
    int front = 0;
    int back = -1;

    void insert (int a ){
        if(back == -1){
            back = 0;
        }else{
            back = (front + size) % 6;
        }
        arr[back] = a;
        size ++;
    }

    int remove(){
        int result = arr[front];
        front = (front + 1) % 6;
        size--;
        return result;
    }

    int peek(){
        return arr[front];
    }



}

//class Main{
//    public static void main(String args[])
//    {
//        QueueUsingArrays aQueue = new QueueUsingArrays();
//        aQueue.insert(6);
//        aQueue.insert(4);
//        aQueue.insert(7);
//
//        aQueue.insert(3);
//
//        aQueue.insert(8);
//        aQueue.remove();
//        aQueue.remove();
//
//        aQueue.insert(9);
//        aQueue.insert(5);
//        // some debugging // front pointing to the seven and its value is 2
//        // Back is pointing to the five and its value is 0
//        System.out.println(aQueue.peek()); // Should be 7
//    }
//}



