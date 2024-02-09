package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

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

        for(int speed = 1; speed < 21; speed++) {
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.accelerate();

        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(23, bike.getSpeed());

    }

    @Test
    public void acceleratesInGearThree_speedIncreasesByThreeTest(){
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for(int count = 1; count < 21; count ++){
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
    public void decelerationTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        bike.accelerate();
        bike.decelerate();
        assertEquals(1, bike.getGear());
        assertEquals(0, bike.getSpeed());

    }



    @Test
    public void deceleratesInGearOne_speedDecreasesByOneTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for (int count = 0; count < 16; count++) {
            bike.accelerate();
        }
        assertEquals(16, bike.getSpeed());

        bike.decelerate();
        assertEquals(1, bike.getGear());
        assertEquals(15, bike.getSpeed());

    }

    @Test
    public void deceleratesInGearTwo_speedDecreasesByTwoTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for (int count = 1; count <= 21; count++) {
            bike.accelerate();
        }
        assertEquals(21, bike.getSpeed());

        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(23, bike.getSpeed());

        bike.decelerate();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());

    }

    @Test
    public void deceleratesInGearThree_speedDecreasesByThreeTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for(int count = 1; count < 21; count ++){
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.accelerate();

        for(int count = 1; count < 5; count++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        assertEquals(29, bike.getSpeed());

        bike.accelerate();

        bike.accelerate();
        bike.decelerate();
        assertEquals(31, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void deceleratesInGearFour_speedDecreasesByFourTest() {
        assertFalse(bike.isEngineOn());
        bike.toggle();
        assertTrue(bike.isEngineOn());

        for (int count = 1; count < 21; count++) {
            bike.accelerate();
        }
        assertEquals(1, bike.getGear());
        assertEquals(20, bike.getSpeed());

        bike.accelerate();

        for (int count = 1; count < 5; count++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        assertEquals(29, bike.getSpeed());

        bike.accelerate();

        for (int count = 1; count < 3; count++) {
            bike.accelerate();
        }
        assertEquals(3, bike.getGear());
        assertEquals(37, bike.getSpeed());

        bike.accelerate();

        bike.accelerate();
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());

        bike.decelerate();
        assertEquals(3, bike.getGear());
        assertEquals(39, bike.getSpeed());
    }





}

