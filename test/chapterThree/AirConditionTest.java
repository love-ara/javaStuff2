package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionTest {
    private AirCondition airCondition;

    @BeforeEach
    public void set() {
        airCondition = new AirCondition();
    }


    @Test
    public void turnOnAnAirCondition_ThatOffTest(){
        assertFalse(airCondition.isTurnedOn());

        airCondition.toggle();
        assertTrue(airCondition.isTurnedOn());
    }

    @Test
    public void turnOffAnAirCondition_andMakeSureItGoesOff(){
        assertFalse(airCondition.isTurnedOn());

        airCondition.toggle();
        airCondition.toggle();
        assertFalse(airCondition.isTurnedOn());
    }

    @Test
    public void increaseTemperature_whenTemperatureIsIncrease(){
        assertFalse(airCondition.isTurnedOn());
        airCondition.toggle();
        assertTrue(airCondition.isTurnedOn());

        airCondition.increaseTemp();
        assertEquals(17, airCondition.getTemp());
    }

    @Test
    public void decreaseTemperature_whenTemperatureIsDecrease(){
        assertFalse(airCondition.isTurnedOn());
        airCondition.toggle();
        assertTrue(airCondition.isTurnedOn());

        airCondition.increaseTemp(20);

        airCondition.decreaseTemp();
        assertEquals(19, airCondition.getTemp());
    }
}
