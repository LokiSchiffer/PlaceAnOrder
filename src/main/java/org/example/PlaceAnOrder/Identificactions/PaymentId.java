package org.example.PlaceAnOrder.Identificactions;

public class PaymentId extends Identifier{

    private int paymentNumber;

    public PaymentId(int id, int paymentNumber) {
        super(id);
        this.paymentNumber = paymentNumber;
    }

    @Override
    public int generateId() {
        return id + paymentNumber + 25;
    }
}
