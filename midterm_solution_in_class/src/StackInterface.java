public interface StackInterface <T>{
    int LIMIT = 5;
    // The following two comments are my spec. to the push()
    // Post-condition: Stack is unchanged if a duplicate object is being added to it.
    // Pre-condition: Argument a should not exist in the stack already
    // Pre-condition: throw an exception if the stack is full
    public void push(T a) throws FullStackException;

    //  finds the location of an element x in the stack.
    //                     The first element in the stack has location number one. The
    //                     second pushed element has location number two and so on.
    // post-condition: should return -1 if item is not in the stack
    // pre-condition:
    public int find(T a);

    //TODO
    public T pop();

    //TODO
    public T peek();

    //TODO
    public T peek1();

    public int get_size();
}
