package oop.e_store;

public record CreditCard(String cardCvv, String expirationDate, String creditCardNumber,
                         String nameOnCard, CardType cardType) {
}
