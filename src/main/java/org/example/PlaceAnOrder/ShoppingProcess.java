package org.example.PlaceAnOrder;

import org.example.PlaceAnOrder.States.*;

public class Process {

    private ProcessState currentState;

    public Process() {
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
