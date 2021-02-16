public class Client {

    public static void main (String args[]){ //driver code or test code
        StackInterface<String> aStack = new ArrayBasedStack<>();
        aStack.push("hi");
        aStack.push("bye");
        aStack.push("Good");
        String x = aStack.peek();
        System.out.println(x);
    }
}
