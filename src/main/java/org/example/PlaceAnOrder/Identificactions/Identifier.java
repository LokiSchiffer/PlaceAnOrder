package org.example.PlaceAnOrder.Identificactions;

public abstract class Identifier {

    protected int id;

    public Identifier(int id) {
        this.id = id;
    }

    public abstract int generateId();

}
