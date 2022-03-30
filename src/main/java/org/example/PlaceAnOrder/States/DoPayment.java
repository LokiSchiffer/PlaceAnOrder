package org.example.PlaceAnOrder.States;

import org.example.PlaceAnOrder.Identificactions.PaymentId;
import org.example.PlaceAnOrder.User;

public class DoPayment implements ProcessState{

    private User user;
    private int paymentConsecutive = 0;
    private PaymentId paymentId;

    public DoPayment(User user) {
        this.user = user;
    }

    public boolean makePayment() {
        user.debit();
        return true;
    }

    public int getPaymentId() {
        paymentId = new PaymentId(user.getCreditCardNumber(),
                paymentConsecutive);
        paymentConsecutive++;
        return paymentId.generateId();
    }

    @Override
    public ProcessState next() {
        return new GenerateOrder();
    }
}
