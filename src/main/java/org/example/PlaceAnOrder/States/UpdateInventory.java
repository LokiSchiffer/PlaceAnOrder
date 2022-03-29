package org.example.PlaceAnOrder.States;

public class UpdateInventory implements ProcessState {


    @Override
    public ProcessState next() {
        return new DoPayment();
    }
}
