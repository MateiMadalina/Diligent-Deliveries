package com.codecool.diligentdeliveries;

public class Report {
    private final int sucessfulDeliveries;
    private final int reattempts;

    public Report(int sucessfulDeliveries, int reattempts){
        this.sucessfulDeliveries = sucessfulDeliveries;
        this.reattempts = reattempts;
    }

    public int getSucessfulDeliveries() {
        return sucessfulDeliveries;
    }


    public String toString() {
        return  " delivered " + sucessfulDeliveries +
                "packages out of 10(" + reattempts +
                " reattempts left)";
    }
}
