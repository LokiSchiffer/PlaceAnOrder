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

    public boolean setReservedFunds(double reservedFunds) {
        if (reservedFunds <= 0) {
            System.out.println("Value not accepted, it should" +
                    " be greater than 0");
            return  false;
        }
        else if (reservedFunds > totalFunds) {
            System.out.println("Not enough funds");
            return false;
        }
        else {
            this.reservedFunds = reservedFunds;
            return true;
        }
    }

    public void debit() {
        this.totalFunds -= reservedFunds;
        this.reservedFunds = 0;
    }
}
