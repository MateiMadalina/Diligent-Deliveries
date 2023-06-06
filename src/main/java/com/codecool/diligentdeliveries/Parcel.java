package com.codecool.diligentdeliveries;

import java.util.Arrays;
import java.util.Random;

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
        Random random = new Random();
        if(random.nextInt(4) == 1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + Arrays.toString(id) +
                ", address=" + address +
                '}';
    }
}
