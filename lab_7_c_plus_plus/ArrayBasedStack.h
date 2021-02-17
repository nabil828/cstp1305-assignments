#include "StackInterface.h"

template<class T>
class ArrayBasedStack : public StackInterface<T>
{
private: 
	int top;
    T arr[10];
public:
    ArrayBasedStack();
     void push(T newEntry);
    T pop();
    T peek();
    bool isEmpty();
    void clear();
};
