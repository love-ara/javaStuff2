package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    private AutomaticBike bike;

    @BeforeEach
    public void setBike(){
        bike = new AutomaticBike();
    }

    @Test
    public void automaticBikeCanComeOn(){
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());
    }

    @Test
    public void automaticBikeCanBeTurnedOff(){
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        bike.toggle();
        assertFalse(bike.isEngineOn());
    }

    @Test
    void acceleratesInGearOne_speedIncreasesByOneTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for (int speed = 1; speed <= 15; speed++) {
            bike.accelerate();
        }
            bike.accelerate();
            assertEquals(16, bike.getSpeed());
            assertEquals(1, bike.getGear());
    }

    @Test
    public void acceleratesInGearTwo_speedIncreasesByTwoTest(){
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for(int speed = 1; speed <= 21; speed++) {
            bike.accelerate();
        }
        assertEquals(21, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(23, bike.getSpeed());

    }

    @Test
    public void acceleratesInGearThree_speedIncreasesByThreeTest(){
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for(int count = 1; count <= 20; count ++){
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());

        for(int count = 1; count <= 5; count++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        assertEquals(29, bike.getSpeed());

        bike.accelerate();

        bike.accelerate();
        assertEquals(3, bike.getGear());
        assertEquals(34, bike.getSpeed());
    }

    @Test
    public void acceleratesInGearFour_speedIncreasesByFourTest(){
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for(int count = 1; count <= 20; count++){
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());

        for(int count = 1; count <= 5; count++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        assertEquals(29, bike.getSpeed());

        bike.accelerate();

        for(int count = 1; count <= 3; count++) {
            bike.accelerate();
        }
        assertEquals(3, bike.getGear());
        assertEquals(40, bike.getSpeed());

        bike.accelerate();

        bike.accelerate();
        assertEquals(4, bike.getGear());
        assertEquals(47, bike.getSpeed());

    }

    @Test
    void decelerationTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        bike.accelerate();
        bike.decelerate();
        assertEquals(1, bike.getGear());
        assertEquals(0, bike.getSpeed());

    }



    @Test
    void deceleratesInGearOne_speedDecreasesByOneTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for (int speed = 0; speed < 16; speed++) {
            bike.accelerate();
        }
        assertEquals(16, bike.getSpeed());

        bike.decelerate();
        assertEquals(1, bike.getGear());
        assertEquals(15, bike.getSpeed());

    }

    @Test
    void deceleratesInGearTwo_speedDecreasesByTwoTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for (int speed = 1; speed < 21; speed++) {
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());

        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(22, bike.getSpeed());


        bike.decelerate();
        //assertEquals(2, bike.getGear());
        assertEquals(22, bike.getSpeed());

    }


}

