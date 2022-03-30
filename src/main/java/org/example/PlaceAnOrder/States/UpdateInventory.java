package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Inventory;
import org.example.PlaceAnOrder.User;

public class UpdateInventory implements ProcessState {

    private User user;
    private Inventory inventory;

    public UpdateInventory(User user, Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean checkProductCode() {
        int productCode = inventory.getProductCode();
        if (productCode >= 239 && productCode <= 384) {
            System.out.println("Product code not valid");
            return false;
        }
        return true;
    }

    public boolean checkQuantity(int quantity) {
        return inventory.setProductQuantity(quantity);
    }

    @Override
    public ProcessState next() {
        return new DoPayment(user);
    }
}
