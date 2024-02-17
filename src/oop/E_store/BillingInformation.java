package oop.E_store;

public class BillingInformation {
    private String receiverPhoneNumber;
    private String receiverName;
    private Address deliveryAddress;
    private CreditCard creditCardInfo;


    public BillingInformation(String receiverPhoneNumber, String receiverName, Address deliveryAddress, CreditCard creditCardInfo) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInfo = creditCardInfo;
    }


    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCard getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCard creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
}
