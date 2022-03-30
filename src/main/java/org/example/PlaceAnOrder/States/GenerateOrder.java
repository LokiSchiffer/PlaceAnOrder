package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Identificactions.OrderId;

public class GenerateOrder implements ProcessState{

    private int orderConsecutive = 0;
    private OrderId orderId;

    @Override
    public ProcessState next() {
        return null;
    }

    public int getOrderId(int id) {
        orderId = new OrderId(id, orderConsecutive);
        orderConsecutive++;
        return orderId.generateId();
    }
}
