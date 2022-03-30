package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Inventory;

public class UpdateInventory implements ProcessState {

    private Inventory inventory;

    public UpdateInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public ProcessState next() {
        return new DoPayment();
    }
}
