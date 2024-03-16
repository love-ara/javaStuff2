package arraysAndPhonebook;

import static org.junit.jupiter.api.Assertions.*;

import arraysAndPhonebook.MenstrualApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class MenstrualAppTest {
    private MenstrualApp app;

    @BeforeEach
    public void createAnInstance(){
        app = new MenstrualApp();
    }

    @Test
    public void getPeriodDaysTest() {
        LocalDate date = LocalDate.of(2024, 1, 1);
        int numberOfDays = 5;
        int menstrualCycle = 28;

        String periodDays = app.getPeriodDays(date, numberOfDays, menstrualCycle);

        assertNotNull(periodDays);
        assertEquals("Monday, 29/January/2024", periodDays);
    }

    @Test
    public void getFertilityDaysTest() {
        LocalDate date = LocalDate.of(2024, 3, 1);
        int menstrualCycle = 28;

        List<String> fertilityDays = app.getFertilityDays(date, menstrualCycle);

        assertNotNull(fertilityDays);
        assertEquals(2, fertilityDays.size());

    }

    @Test
    public void getOvulationDayTest() {

        LocalDate date = LocalDate.of(2024, 1, 1);
        int menstrualCycle = 28;

        String ovulationDay = app.getOvulationDay(date, menstrualCycle);

        assertNotNull(ovulationDay);
        assertEquals("Monday, 15/January/2024", ovulationDay);
    }

   // @Test
//    public void getDueDateTest() {
//        LocalDate date = LocalDate.of(2024, 3, 1); // Example date
//        int menstrualCycle = 28;
//
//        String dueDate = app.getDueDate(date, menstrualCycle);
//
//        assertNotNull(dueDate);
//        assertEquals("Friday, 6/December/2024", dueDate);
//    }

}
