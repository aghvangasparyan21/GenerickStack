package Stack;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> Stack;
    private int size;
    private int defaultSize;

    public GenericStack() {
        this(10);
    }

    public GenericStack(int sizeOfStack) {
        Stack = new ArrayList<T>(sizeOfStack);
        size = 0;
        defaultSize = sizeOfStack;
    }

    public void push(T element) {
        if (size >= defaultSize) {
            reSize(2 * defaultSize);
        }
        Stack.add(element);
        size++;
    }

    public T pop(T element) {
        if (Stack == null) {
            throw new RuntimeException("Your container is empty");
        }
        T popableElement = Stack.get(size);
        Stack.remove(size--);
        if (size <= defaultSize / 4) {
            reSize(defaultSize / 2);
        }
        return popableElement;
    }

    public T peek() {
        return Stack.get(size);
    }

    public boolean isEmpty() {
        return Stack.isEmpty();
    }

    private void reSize(int newSize) {
        ArrayList<T> newStack = new ArrayList<>(newSize);
        for (int i = 0; i < size; ++i) {
            newStack.add(Stack.get(i));
        }
        Stack = newStack;
        defaultSize = newSize;
    }

}
