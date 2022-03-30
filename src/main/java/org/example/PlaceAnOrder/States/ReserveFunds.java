package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Inventory;
import org.example.PlaceAnOrder.User;

public class ReserveFunds implements ProcessState {

    private User user;
    private Inventory inventory;

    public ReserveFunds(User user, Inventory inventory) {
        this.user = user;
        this.inventory = inventory;
    }

    @Override
    public ProcessState next() {
        return new UpdateInventory(inventory);
    }
}
