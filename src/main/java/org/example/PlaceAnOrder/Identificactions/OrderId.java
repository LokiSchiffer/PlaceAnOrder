package org.example.PlaceAnOrder.Identificactions;

public class OrderId extends Identifier{

    private int orderNumber;

    public OrderId(int id, int orderNumber) {
        super(id);
        this.orderNumber = orderNumber;
    }

    @Override
    public int generateId() {
        return id + orderNumber + 125;
    }
}
