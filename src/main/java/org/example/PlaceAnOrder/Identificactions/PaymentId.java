package org.example.PlaceAnOrder.Identificactions;

public class PaymentId extends Identifier{

    private int paymentNumber;

    public PaymentId(String id, int paymentNumber) {
        super(id);
        this.paymentNumber = paymentNumber;
    }

    @Override
    public String generateId() {
        return id.hashCode() + paymentNumber + " payment";
    }
}
