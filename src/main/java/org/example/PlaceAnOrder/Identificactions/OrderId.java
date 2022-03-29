package org.example.PlaceAnOrder.Identificactions;

public class OrderId extends Identifier{

    private int orderNumber;

    public OrderId(String id, int orderNumber) {
        super(id);
        this.orderNumber = orderNumber;
    }

    @Override
    public String generateId() {
        return null;
    }
}
