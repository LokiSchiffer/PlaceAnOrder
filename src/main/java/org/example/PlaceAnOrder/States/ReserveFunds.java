package org.example.PlaceAnOrder.States;

public class ReserveFunds implements ProcessState {


    @Override
    public ProcessState next() {
        return new UpdateInventory();
    }
}
