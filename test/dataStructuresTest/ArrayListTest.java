package dataStructuresTest;

import dataStructures.ArrayLst;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private ArrayLst strings;

    @BeforeEach
    public void createNewInstance(){
        strings = new ArrayLst();

    }

    @Test
    public void newArrayListIsEmpty(){
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addNewItemToEmptyList_ListIsNotEmptyTest(){
        assertTrue(strings.isEmpty());

        strings.addElement("rice");
        assertFalse(strings.isEmpty());
    }

    @Test
    public void addNewElement_listIsEmptyTest(){
        assertTrue(strings.isEmpty());

        strings.addElement("sweet potato");
        assertFalse(strings.isEmpty());

        strings.removeElement("sweet potato");
        assertTrue(strings.isEmpty());

    }

    @Test
    public void addTwoElements_removeOneElementTest(){
        assertTrue(strings.isEmpty());

        strings.addElement("sweet potato");
        strings.addElement("rice");
        assertFalse(strings.isEmpty());

        strings.removeElement("sweet potato");
        assertFalse(strings.isEmpty());
    }

    @Test
    public void addOneElement_getByIndex(){
        assertTrue(strings.isEmpty());

        strings.addElement("sweet potato");
        assertFalse(strings.isEmpty());

        assertEquals("sweet potato", strings.getElement(1));
    }

    @Test
    public void addTwoElementsGetOneOfTheElementsByIndex(){
        assertTrue(strings.isEmpty());

        strings.addElement("sweet potato");
        strings.addElement("rice");
        assertFalse(strings.isEmpty());

        assertEquals("rice", strings.getElement(2));
        assertEquals("sweet potato", strings.getElement(1));
    }

    @Test
    public void addThreeElement_removeSecondElement_thirdElementIndexIs2Test(){
        assertTrue(strings.isEmpty());

        strings.addElement("sweet potato");
        strings.addElement("wheat bread");
        strings.addElement("rice");
        assertFalse(strings.isEmpty());

        strings.removeElement("wheat bread");

        assertEquals(2, strings.getIndex("rice"));
    }


//    @Test
//    public void testThatListCanStoreSixOrMoreElementsAfterAddingByIndex() {
//        strings.addElement("cookie");
//        strings.addElement("apple");
//        strings.addElement("pea");
//        assertEquals(3, strings.size());
//        assertEquals(2, strings.getIndex("pea"));
//
//        strings.addElement(3, "see");
//        assertEquals(4, strings.size());
//        assertEquals(4, strings.getIndex("we"));
//        assertEquals(3, strings.getIndex("you"));
//
//        strings.addElement("cocoa");
//        assertEquals(5, strings.size());
//        strings.addElement("tea");
//        assertEquals(6, strings.size());
//    }

    @Test
    public void removeElementThatIsNotOnTheFromList_throwsException(){
        assertTrue(strings.isEmpty());

        strings.addElement("chocolate");
        strings.addElement("short bread");
        assertFalse(strings.isEmpty());

        assertThrows(IllegalArgumentException.class, ()-> strings.removeElement("vegetable cookies"));
    }
}
