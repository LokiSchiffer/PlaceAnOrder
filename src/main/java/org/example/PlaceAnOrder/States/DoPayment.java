package org.example.PlaceAnOrder.States;

public class DoPayment implements ProcessState{


    @Override
    public ProcessState next() {
        return new GenerateOrder();
    }
}
