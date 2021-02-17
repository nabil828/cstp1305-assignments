#pragma
#include "ArrayBasedStack.h"
template <class T>
ArrayBasedStack<T>::ArrayBasedStack() {
    top = -1;
}

template <class T>
 void ArrayBasedStack<T>::push(T newEntry) {
    top++;
    arr[top] = newEntry;
}

template <class T>
T ArrayBasedStack<T>::peek() {
    T tmp = arr[top];
    return tmp;
}

template <class T>
T ArrayBasedStack<T>::pop() {
    T tmp = arr[top];
    top--;
    return tmp;
}

template <class T>
bool ArrayBasedStack<T>::isEmpty() {
    return top == 0;
}

template <class T>
void ArrayBasedStack<T>::clear() {
    top = 0;
}

