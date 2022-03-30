package org.example.PlaceAnOrder;

import org.example.PlaceAnOrder.States.DoPayment;
import org.example.PlaceAnOrder.States.GenerateOrder;
import org.example.PlaceAnOrder.States.ReserveFunds;
import org.example.PlaceAnOrder.States.UpdateInventory;

public class Client {

    public static void main(String[] args) {
        ShoppingProcess shop = new ShoppingProcess(new User(4125,
                5000, "LokiSchiffer"), new Inventory(450,
                200, "Cookies"));

        boolean flag;
        int reservationCode = 0, paymentCode = 0, orderId = 0;

        shop.startProcess();

        flag = ((ReserveFunds) shop.getCurrentState()).checkCard();

        if (flag) {
            flag = ((ReserveFunds) shop.getCurrentState()).checkAmount(350);
        }

        if (flag) {
            reservationCode = ((ReserveFunds) shop.getCurrentState()).getReservedId();
            System.out.println("Fund Reserved");
            shop.reservedFunds();
            flag = ((UpdateInventory) shop.getCurrentState()).checkProductCode();
        }

        if (flag) {
            flag = ((UpdateInventory) shop.getCurrentState()).checkQuantity(50);
        }

        if (flag) {
            System.out.println("Inventory Updated");
            shop.updatedInventory();
            ((DoPayment) shop.getCurrentState()).makePayment();
            paymentCode = ((DoPayment) shop.getCurrentState()).getPaymentId();
            shop.paymentMade();
            orderId = ((GenerateOrder) shop.getCurrentState()).getOrderId(123);
        }

        if (reservationCode == 0 || paymentCode == 0 || orderId == 0){
            System.out.println("Process not completed, please try again");
        } else {
            System.out.println("Your order was correctly processed, the validation codes are:\n" +
                    "Reservation Code: " + reservationCode + ",\n" +
                    "Payment Code: " + paymentCode + ",\n" +
                    "Order ID: " + orderId);
        }



    }
}
