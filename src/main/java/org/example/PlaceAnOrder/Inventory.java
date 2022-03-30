package org.example.PlaceAnOrder;

public class Inventory {

    private final int productCode;
    private int productQuantity;
    private final String productName;

    public Inventory(int productCode, int productQuantity, String productName) {
        this.productCode = productCode;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        if (productQuantity <= 0)
            System.out.println("Quantity not accepted, it should" +
                    " be greater than 0");
        this.productQuantity -= productQuantity;
    }
}
