package dataStructuresTest;

import dataStructures.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

        mySet.add("chocolate");
        mySet.remove("chocolate");

        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addAnItem_
    @Test
    public void mySetCanAddItem(){
        assertTrue(mySet.isEmpty());

        assertEquals(true, mySet.add("sweets"));
    }

    @Test
    public void mySetCanAddAll(){
        assertTrue(mySet.isEmpty());
        mySet.addAll(Arrays.asList("cho", "sweets", "o"));

        assertTrue(mySet.contains("cho"));
        assertTrue(mySet.contains("o"));

    }

    @Test

}
