import java.util.EmptyStackException;

public class ArrayBasedStack implements StackInterface {
    int [] arr = new int[10];
    int top  = -1;

    public void push(int a) {
        arr[top + 1] = a;
        top++;
    }

    public int pop(){
        if(top < 0)
            throw new EmptyStackException();
        else{
            int tmp = arr[top];
            top--;
            return tmp;
        }
    }
    public int peek(){
        if(top < 0)
            throw new EmptyStackException();
        else {
            return arr[top];
        }
    }
}
