package com.codecool.diligentdeliveries;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Rider {

    private int id;
    private String name;
    private int reattemptPerAddress;
    private int maximumReattempts;
    private int successfulDeliveries;
    private int reattemptsLeft;

    public Rider(int id, int reattemptPerAddress, int maximumReattempts){
        this.id = id;
        this.reattemptPerAddress = reattemptPerAddress;
        this.maximumReattempts = maximumReattempts;
        this.name = "Rider" + id;
        this.successfulDeliveries = 0;
        this.reattemptsLeft = maximumReattempts;

    }

    public void addParcels(ArrayList<Parcel> parcels){
        //Implement
    }



    public void startRoutine(ArrayList<Parcel> parcels) {
        ArrayList<Parcel> packagesLeft = new ArrayList<>(parcels);

        while (!packagesLeft.isEmpty() && reattemptsLeft > 0) {
            for (int i = 0; i < packagesLeft.size(); i++) {
                Parcel currentParcel = packagesLeft.get(i);

                int tryToReattempt = 0;
                while (tryToReattempt < reattemptPerAddress) {
                    if ( handleSuccessfulDelivery(currentParcel)) {
                        packagesLeft.remove(currentParcel);
                        successfulDeliveries++;
                        break;
                    } else if(reattempt(currentParcel)) {
                        tryToReattempt++;
                    }
                }
            }

            reattemptsLeft--;
        }
    }


    private boolean reattempt(Parcel parcel)
    {
        return !parcel.succesfulDeliver();
    }

    private boolean handleSuccessfulDelivery(Parcel parcel)
    {
        return parcel.succesfulDeliver();
    }

    public Report getReport()
    {
        return  new Report(this.successfulDeliveries, this.reattemptsLeft);
    }


    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reattemptPerAddress=" + reattemptPerAddress +
                ", maximumReattempts=" + maximumReattempts +
                '}';
    }
}
