package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Inventory;
import org.example.PlaceAnOrder.User;

public class ReserveFunds implements ProcessState {

    private User user;
    private Inventory inventory;

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
        if(user.setReservedFunds(amount)){
            System.out.println("Problem with checking, " +
                    "process aborted");
            return false; 
        }
        return user.getAvailableFunds() > 0;
    }

    @Override
    public ProcessState next() {
        return new UpdateInventory(inventory);
    }
}
