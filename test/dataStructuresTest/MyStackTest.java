package dataStructuresTest;

import dataStructures.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack stack;

    @BeforeEach
    public void createNewInstance() {
        stack = new MyStack(5);
    }

    @Test
    public void newStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addOneItem_myStackIsNotEmptyTest(){
        assertTrue(stack.isEmpty());

        stack.push("spoon");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void addOneItem_removeTheItem_myStackIsEmpty(){
        assertTrue(stack.isEmpty());

        stack.push("plate");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addThreeItems_removeOneItem_myStackNotEmptyTest(){
        assertTrue(stack.isEmpty());

        stack.push("plate");
        stack.push("spoon");
        stack.push("knife");

        stack.pop();
        assertFalse(stack.isEmpty());
        assertEquals("spoon", stack.peek());
    }

    @Test
    public void addItems_searchForItems(){
        assertTrue(stack.isEmpty());

        stack.push("plate");
        stack.push("spoon");
        stack.push("knife");

        assertEquals(3, stack.search("plate"));
        assertThrows(NoSuchElementException.class, ()-> stack.search("cup"));
    }
}
