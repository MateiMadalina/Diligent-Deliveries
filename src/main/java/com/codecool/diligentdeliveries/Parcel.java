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



    public boolean succesfulDeliver(){
        Random random = new Random();
        return random.nextInt(4) == 1;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + Arrays.toString(id) +
                ", address=" + address +
                '}';
    }
}
