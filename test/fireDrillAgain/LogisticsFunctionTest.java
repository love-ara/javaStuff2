package fireDrillAgain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogisticsFunctionTest {
    private LogisticsFunction func;

    @BeforeEach
    public void createAnInstance(){
        func = new LogisticsFunction();
    }

    @Test
    public void functionCanReturnTheCorrectPaymentWage_atLessFiftyPercentCollectionRate(){
        assertEquals(9000, func.calculatePayment(25));
        assertEquals(9800, func.calculatePayment(30));
        assertEquals(11400, func.calculatePayment(40));
        assertEquals(12840, func.calculatePayment(49));
    }
    @Test
    public void functionCanReturnTheCorrectPaymentWage_atFiftyToFiftyNinePercentCollectionRate(){
        assertEquals(15000, func.calculatePayment(50));
        assertEquals(16000, func.calculatePayment(55));
        assertEquals(16800, func.calculatePayment(59));
    }

    @Test
    public void functionCanReturnTheCorrectPaymentWage_atSixtyToSixtyNinePercentCollectionRate(){
        assertEquals(20500, func.calculatePayment(62));
        assertEquals(21250, func.calculatePayment(65));
    }

    @Test
    public void functionCanReturnTheCorrectPaymentWage_atSeventyPercentAndAboveCollectionRate(){
        assertEquals(40000, func.calculatePayment(70));
        assertEquals(45000, func.calculatePayment(80));
        assertEquals(50000, func.calculatePayment(90));
        assertEquals(55000, func.calculatePayment(100));
    }

    @Test
    public void negativeSuccessfulDeliveries_throwsException(){
        assertThrows(IllegalArgumentException.class, ()->func.calculatePayment(-20));
        assertThrows(IllegalArgumentException.class, ()->func.calculatePayment(0));
    }
    @Test
    public void successfulDeliveriesGreaterThan_100throwsException(){
        assertThrows(IllegalArgumentException.class, ()-> func.calculatePayment(120));
        assertThrows(IllegalArgumentException.class, ()-> func.calculatePayment(189));
    }

}
