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

        airCondition.turnOn();
        assertTrue(airCondition.isTurnedOn());
    }

    @Test
    public void turnOffAnAirCondition_andMakeSureItGoesOff(){
        airCondition.turnOn();
        assertTrue(airCondition.isTurnedOn());

        airCondition.turnOff();
        assertFalse(airCondition.isTurnedOn());
    }

    @Test
    public void increaseTemperature_whenTemperatureIsIncrease(){
        airCondition.turnOn();
        assertTrue(airCondition.isTurnedOn());

        airCondition.increaseTemp();
        assertEquals(17, airCondition.getTemp());
    }
}
