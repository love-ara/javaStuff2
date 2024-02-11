package dataStructuresTest;

import dataStructures.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void crateAnInstance(){
        mySet = new MySet();
    }

    @Test
    public void mySetIsEmptyTest(){
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void mySetCanAddItem(){
        assertTrue(mySet.isEmpty());

        assertEquals(true, mySet.add("s"));
    }

    @Test
    public void mySetCanAddAll(){
        assertTrue(mySet.isEmpty());


    }
}
