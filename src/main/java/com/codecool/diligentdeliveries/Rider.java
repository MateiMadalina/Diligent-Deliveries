package com.codecool.diligentdeliveries;

import java.util.ArrayList;

public class Rider {
    private final int reattemptPerAddress;
    private int successfulDeliveries;
    private int reattemptsLeft;

    public Rider(int id, int reattemptPerAddress, int maximumReattempts){
        this.reattemptPerAddress = reattemptPerAddress;
        this.successfulDeliveries = 0;
        this.reattemptsLeft = maximumReattempts;
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

}
