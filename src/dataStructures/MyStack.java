package dataStructures;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack {
    private int stackSize;
    private String[] items;
    private int topIndex;

    public MyStack(int size) {
        boolean isEmpty = true;
        stackSize = size;
        items = new String[stackSize];
        topIndex = 0;
    }

    public boolean isEmpty() {
        return topIndex == 0;
    }

    public boolean isFull(){
        return topIndex == stackSize;
    }


    public void push(String item) {
        if(isFull()) throw new StackOverflowError("Stack is full can not add " + item);
        items[++topIndex] = item;
    }

    public String pop(){
        if(isEmpty()) throw new EmptyStackException();
        return items[topIndex--];
    }

    public String peek(){
        if(isEmpty()) throw new EmptyStackException();
        return items[topIndex];
    }

    public int search(String item){
        int counter = 0;
        for(int index = 0; index <= topIndex; index++){
            if(items[index] == item){
                return topIndex - index + 1;

            }
            counter++;
        }
        throw new NoSuchElementException(item + " not found");
    }

}
