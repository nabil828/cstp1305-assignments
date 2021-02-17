import java.util.EmptyStackException;

public class ArrayBasedStack<T> implements StackInterface<T> {
    T [] arr = (T[]) new Object [10]; //casting
    int top  = -1;

    public void push(T a) {
        arr[top + 1] = a;
        top++;
    }

    public T pop(){
        if(top < 0)
            throw new EmptyStackException();
        else{
            T tmp = arr[top];
            top--;
            return tmp;
        }
    }
    public T peek(){
        if(top < 0)
            throw new EmptyStackException();
        else {
            return arr[top];
        }
    }
}
