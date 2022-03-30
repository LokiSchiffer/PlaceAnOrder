package org.example.PlaceAnOrder;

public class User {

    private final int creditCardNumber;
    private double totalFunds;
    private double reservedFunds;
    private final String username;

    public User(int creditCardNumber, double totalFunds, String username) {
        this.creditCardNumber = creditCardNumber;
        this.totalFunds = totalFunds;
        this.username = username;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getAvailableFunds() {
        return totalFunds-reservedFunds;
    }

    public void setReservedFunds(double reservedFunds) {
        if (reservedFunds <= 0)
            System.out.println("Value not accepted, it should" +
                    " be greater than 0");
        else if (reservedFunds < totalFunds)
            this.reservedFunds = reservedFunds;
        else
            System.out.println("Not enough funds");
    }

    public void debit() {
        this.totalFunds -= reservedFunds;
        this.reservedFunds = 0;
    }
}
