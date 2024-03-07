package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static fireDrillAgain.LogisticsFunction.calculatePayment;
import static org.junit.jupiter.api.Assertions.*;

public class LogisticsFunctionTest {


    @Test
    public void functionCanReturnTheCorrectPaymentWage_atLessFiftyPercentCollectionRate(){
        assertEquals(9000, calculatePayment(25));
        assertEquals(9800, calculatePayment(30));
        assertEquals(11400, calculatePayment(40));
        assertEquals(12840, calculatePayment(49));
    }
    @Test
    public void functionCanReturnTheCorrectPaymentWage_atFiftyToFiftyNinePercentCollectionRate(){
        assertEquals(15000, calculatePayment(50));
        assertEquals(16000, calculatePayment(55));
        assertEquals(16800, calculatePayment(59));
    }

    @Test
    public void functionCanReturnTheCorrectPaymentWage_atSixtyToSixtyNinePercentCollectionRate(){
        assertEquals(20500, calculatePayment(62));
        assertEquals(21250, calculatePayment(65));
    }

    @Test
    public void functionCanReturnTheCorrectPaymentWage_atSeventyPercentAndAboveCollectionRate(){
        assertEquals(40000, calculatePayment(70));
        assertEquals(45000, calculatePayment(80));
        assertEquals(50000, calculatePayment(90));
        assertEquals(55000, calculatePayment(100));
    }

    @Test
    public void negativeSuccessfulDeliveries_throwsException(){
        assertThrows(IllegalArgumentException.class, ()->calculatePayment(-20));
        assertThrows(IllegalArgumentException.class, ()->calculatePayment(0));
    }
    @Test
    public void successfulDeliveriesGreaterThan_100throwsException(){
        assertThrows(IllegalArgumentException.class, ()-> calculatePayment(120));
        assertThrows(IllegalArgumentException.class, ()-> calculatePayment(189));
    }

}
