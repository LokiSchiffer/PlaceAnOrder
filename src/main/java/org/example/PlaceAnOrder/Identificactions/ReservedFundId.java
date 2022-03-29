package org.example.PlaceAnOrder.Identificactions;

public class ReservedFundId extends Identifier{

    private int reservationNumber;

    public ReservedFundId(String id, int reservationNumber) {
        super(id);
        this.reservationNumber = reservationNumber;
    }

    @Override
    public String generateId() {
        return id.hashCode() + reservationNumber + " Reserved";
    }
}
