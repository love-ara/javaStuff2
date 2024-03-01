package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void createInstance(){
        myQueue = new MyQueue(5);
    }

    @Test
    public void myQueueIsEmptyTest(){
       assertTrue(myQueue.isEmpty());
    }
}
