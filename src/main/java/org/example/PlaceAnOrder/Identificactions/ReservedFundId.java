package org.example.PlaceAnOrder.Identificactions;

public class ReservedFundId extends Identifier{

    private int reservationNumber;

    public ReservedFundId(int id, int reservationNumber) {
        super(id);
        this.reservationNumber = reservationNumber;
    }

    @Override
    public int generateId() {
        return id + reservationNumber + 5;
    }
}
