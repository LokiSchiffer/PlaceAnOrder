package org.example.PlaceAnOrder;

import org.example.PlaceAnOrder.States.*;

public class ShoppingProcess {

    private ProcessState currentState;
    private User user;
    private Inventory inventory;

    public ShoppingProcess(User user, Inventory inventory) {
        this.user = user;
        this.inventory = inventory;
    }

    public ProcessState getCurrentState() {
        return currentState;
    }

    public void startProcess(){
        currentState = new ReserveFunds(user, inventory);
    }

    public void reservedFunds() {
        processed();
    }

    public void updatedInventory() {
        processed();
    }

    public void paymentMade() {
        processed();
    }

    private void processed() {
        currentState = currentState.next();
    }
}
