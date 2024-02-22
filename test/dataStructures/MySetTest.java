package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;



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
    public void addAnItem_removeTheItem_mySetIsEmptyTest(){
        assertTrue(mySet.isEmpty());

        mySet.addItem("chocolate");
        mySet.removeItem("chocolate");

        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addAnItem_mySetNotEmptyTest(){
        assertTrue(mySet.isEmpty());
        mySet.addItem("cookie");

        assertFalse(mySet.isEmpty());
    }

    @Test
    public void mySetCanAddItem(){
        assertTrue(mySet.isEmpty());

        mySet.addItem("sweets");
        assertTrue(mySet.contains("sweets"));
    }

    @Test
    public void mySetCanAddAll(){
        assertTrue(mySet.isEmpty());
        mySet.addAll(Arrays.asList("cho", "sweets", "o"));

        assertTrue(mySet.contains("cho"));
        assertTrue(mySet.contains("o"));

    }

    @Test
    public void mySetSize(){
        assertEquals(0, mySet.size());
        mySet.addItem("x");

        assertEquals(1, mySet.size());
    }

    @Test
    public void mySetCanClear(){
        mySet.addAll(Arrays.asList("qww", "www", "qas"));
        mySet.clear();
        assertTrue(mySet.isEmpty());
    }

}
