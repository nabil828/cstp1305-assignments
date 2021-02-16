public interface StackInterface<T> {

    // adds an item @param a into the top of the stack
    public void push(T a); // header of this method. impl. later

    // this removes and return the top  of the stack
    // throws an exceptopn if the stack is empty
    public T pop();

    // this would return the top of the stack
    public T peek();
}
