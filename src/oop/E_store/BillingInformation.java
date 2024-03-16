package oop.e_store;

public record BillingInformation(String receiverPhoneNumber, String receiverName,
                                 Address deliveryAddress, CreditCard creditCardInfo){

}

