package oop.E_store;

import java.util.List;

public class CreditCard {
    private String cardCvv;
    private String expirationYear;
    private String expirationMonth;
    private String creditCardNumber;
    private String nameOnCard;
    private CardType cardType;


    public CreditCard(String cardCvv, String expirationYear, String expirationMonth, String creditCardNumber, String nameOnCard, CardType cardType) {
        this.cardCvv = cardCvv;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
