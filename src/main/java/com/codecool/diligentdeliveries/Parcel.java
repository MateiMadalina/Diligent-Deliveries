package com.codecool.diligentdeliveries;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + Arrays.toString(id) +
                ", address=" + address +
                '}';
    }
}
