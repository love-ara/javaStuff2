package fireDrillAgain;

public class LogisticsFunction {

    public static int calculatePayment(int successfulDeliveries) {
        if (successfulDeliveries <= 0) {
            throw new IllegalArgumentException("Number of successful deliveries cannot be negative.");
        } else if (successfulDeliveries > 100) {
            throw new IllegalArgumentException("Number of successful deliveries cannot exceed 100.");
        }
        int amountPerParcel = 500;
        int basePay = 5000;
        int wage;

        if(successfulDeliveries < 50){
            wage = (successfulDeliveries * 160);
        } else if (successfulDeliveries <= 59) {
            wage = (successfulDeliveries * 200);
        } else if (successfulDeliveries <= 69) {
            wage = (successfulDeliveries * 250);
        }else {
            wage = (successfulDeliveries * 500);
        }
        return  wage + basePay;
    }
}
