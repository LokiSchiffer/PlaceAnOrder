package org.example.PlaceAnOrder;

import org.example.PlaceAnOrder.States.ProcessState;
import org.example.PlaceAnOrder.States.ReserveFunds;

public class Process {

    private ProcessState currentState;

    public Process() {
        currentState = new ReserveFunds();
    }
}
