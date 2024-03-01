package dataStructures;

public class MyQueue {
    private  String[] array1;
    private int maxSize;
    private int head;
    private int tail;

    public MyQueue(int size){
        maxSize = size + 1;
        array1 = new String[maxSize];
        head = 0;
        tail = -1;
    }
     public boolean add(String element){
        if(tail == maxSize -1)
            tail = -1;
        array1[++tail] = element;
        return true;
     }

     public int element(){
        return head;
     }
     public boolean isEmpty(){
        return  tail+ 1 == head || head + maxSize -1 == tail;
     }

     private boolean isFull(){
        return  tail + 2 == head || head + maxSize - 2 == tail;
     }

     private String peek(){
        return array1[head];
     }
     private String remove(){
        String temp = array1[head++];
        if (head == maxSize)
            head = 0;
        return temp;
     }
}

