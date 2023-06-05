package com.codecool.diligentdeliveries;

public class Parcel {
    private final int[] id;
    private final Address address;

    public Parcel(int[] id, Address address){
        this.id = id;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public int[] getId() {
        return id;
    }

    public boolean succesfulDeliver(){
        return true;
    }
}
