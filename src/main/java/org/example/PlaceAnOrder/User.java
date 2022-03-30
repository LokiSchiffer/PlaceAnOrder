package org.example.PlaceAnOrder;

public class User {

    private int creditCardNumber;
    private double availableFunds;
    private double reservedFunds;
    private String username;

    public User(int creditCardNumber, double availableFunds, String username) {
        this.creditCardNumber = creditCardNumber;
        this.availableFunds = availableFunds;
        this.username = username;
    }
}
