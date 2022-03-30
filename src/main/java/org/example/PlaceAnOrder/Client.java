package org.example.PlaceAnOrder;

public class Client {

    public static void main(String[] args) {
        ShoppingProcess shop = new ShoppingProcess(new User(4125,
                5000, "LokiSchiffer"),
                new Inventory(350, 200,
                        "Cookies"));

    }
}
