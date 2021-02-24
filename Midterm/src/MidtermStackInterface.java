public interface MidtermStackInterface <T>{
    // push an item to the top of the stack
    // pre condition: the stack should not be full
    // pre condition: the item should not exist already in the stack
    // post condition: throws an exception when the stack is full
    void push(T a) throws FullStackException;

    // postcondition: remove and return an item from the top of the stack
    // precondition: the stack should not be empty
    // post condition: throws an exception when the stack is empty
    T pop() throws EmptyStackException;

    // postcondition: return an item from the top of the stack
    // precondition: the stack should not be empty
    // post condition: throws an exception when the stack is empty
    T peek() throws EmptyStackException;

    // postcondition: return the first item pushed to the stack
    // precondition: the stack should not be empty
    // post condition: throws an exception when the stack is empty
    T peek1() throws EmptyStackException;

    // postcondition: return the size of the stack
    int getsize();

    //finds  the location of an element x in the stack.
    //                     The first element in the stack has location number one. The
    //                     second pushed element has location number two and so on.
    // if not exist may be return -1
    int find(T x);
}
