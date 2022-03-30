package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Identificactions.ReservedFundId;
import org.example.PlaceAnOrder.Inventory;
import org.example.PlaceAnOrder.User;

public class ReserveFunds implements ProcessState {

    private User user;
    private Inventory inventory;
    private int reservation = 0;
    private ReservedFundId reservedFundId;

    public ReserveFunds(User user, Inventory inventory) {
        this.user = user;
        this.inventory = inventory;
    }

    public boolean checkCard() {
        int cardNumber = user.getCreditCardNumber();
        if (cardNumber == 4000) {
            System.out.println("Credit card number not valid");
            return false;
        } else if (cardNumber < 4111 || cardNumber > 4222) {
            System.out.println("Credit card number out of bounds");
            return false;
        }
        return true;
    }

    public boolean checkAmount(double amount) {
        if(!user.setReservedFunds(amount)){
            System.out.println("Problem with checking, " +
                    "process aborted");
            return false;
        }
        return user.getAvailableFunds() > 0;
    }

    public int getReservedId() {
        reservedFundId = new ReservedFundId(user.getCreditCardNumber(),
                reservation);
        reservation++;
        return reservedFundId.generateId();
    }



    @Override
    public ProcessState next() {
        return new UpdateInventory(user, inventory);
    }
}
