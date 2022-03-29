package org.example.PlaceAnOrder;

import org.example.PlaceAnOrder.States.*;

public class ShoppingProcess {

    private ProcessState currentState;

    public ShoppingProcess() {
        currentState = new ReserveFunds();
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

    public void processed() {
        currentState = currentState.next();
    }
}
