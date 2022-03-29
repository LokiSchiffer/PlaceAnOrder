package org.example.PlaceAnOrder.Identificactions;

public abstract class Identifier {

    protected String id;

    public Identifier(String id) {
        this.id = id;
    }

    public abstract String generateId();

}
