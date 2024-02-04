package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television television;

    @BeforeEach
    public void setTv(){
        television = new Television();
    }


    @Test
    public void televisionComesOn_whenTurnedOnTest(){
        assertFalse(television.isTvOn());

        television.toggle();
        assertTrue(television.isTvOn());
    }

    @Test
    public void televisionGoesOff_whenTurnedOffTest(){
        assertFalse(television.isTvOn());

        television.toggle();
        assertTrue(television.isTvOn());

        television.toggle();
        assertFalse(television.isTvOn());
    }

    @Test
    public void televisionVolumeCanIncrease_whenVolumeIsIncreased(){
        assertFalse(television.isTvOn());

        television.toggle();
        assertTrue(television.isTvOn());

        assertEquals(0, television.getVolume());

        television.increaseVolume();
        assertEquals(1, television.getVolume());
    }

    @Test
    public void televisionVolumeCanReduce_whenVolumeIsReduced(){
        assertFalse(television.isTvOn());

        television.toggle();
        assertTrue(television.isTvOn());

        assertEquals(0, television.getVolume());

        television.increaseVolume();
        television.increaseVolume();
        assertEquals(2, television.getVolume());

        television.reduceVolume();
        assertEquals(1, television.getVolume());
    }

    @Test
    public void televisionCanSearchAndGetChannelTest(){
        assertFalse(television.isTvOn());

        television.toggle();
        assertTrue(television.isTvOn());

        assertEquals(1, television.getChannel());

        television.setChannel(10);
        assertEquals(10, television.getChannel());

        assertEquals(10, television.searchChannel(10));

        assertEquals(10, television.searchChannel(12));
    }

}



