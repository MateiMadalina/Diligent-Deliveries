package com.codecool.diligentdeliveries;

import java.util.ArrayList;
import java.util.Random;

public class Application {

    private static final Random random = new Random();

    private static String getRandomStreetAddress() {
        return "Random Street "
                + random.nextInt(100, 1000)
                + " Number " + random.nextInt(0, 100);
    }
    public static ArrayList<Parcel> generateParcels (){
        ArrayList<Address> allAddress = new ArrayList<>();
        ArrayList<Parcel> parcels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[4];

            for (int j = 0; j < array.length; j++) {
                array[j] = random.nextInt(10);
            }
            allAddress.add(new Address(array, getRandomStreetAddress(), "Customer" + i));
        }

        for(int i = 0; i< 10; i++){
            int[] id = new int[5];
            for (int j = 0; j < id.length; j++) {
                id[j] = random.nextInt(10);
            }
            parcels.add(new Parcel(id,allAddress.get(i)));
        }
        return parcels;
    }

    public static void main(String[] args) {
        int packages = 10;
        int maximumReattempts = 5;

        Rider rider0 = new Rider(0, 1, maximumReattempts);
        Rider rider1 = new Rider(0, 5, maximumReattempts);
        Rider rider2 = new Rider(0, 3, maximumReattempts);

        for (int i = 0; i < 10; i++) {
            System.out.println(generateParcels());
        }



    }
}
