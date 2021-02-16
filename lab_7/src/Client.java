public class Client {

    public static void main (String args[]){ //driver code or test code
        StackInterface aStack = new LinkedListStack();
        aStack.push(10);
        aStack.push(23);
        aStack.push(87);
        int x = aStack.peek();
        System.out.println(x);
    }
}
