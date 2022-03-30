package org.example.PlaceAnOrder;

public class Inventory {

    private int productCode;
    private int productQuantity;
    private String productName;

    public Inventory(int productCode, int productQuantity, String productName) {
        this.productCode = productCode;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }
}
