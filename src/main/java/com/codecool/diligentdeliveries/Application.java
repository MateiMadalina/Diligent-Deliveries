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
        int maximumReattempts = 5;

        Rider rider0 = new Rider(0, 1, maximumReattempts);
        Rider rider1 = new Rider(1, 5, maximumReattempts);
        Rider rider2 = new Rider(2, 3, maximumReattempts);

        rider0.startRoutine(generateParcels());
        rider1.startRoutine(generateParcels());
        rider2.startRoutine(generateParcels());

        Report report0 = rider0.getReport();
        Report report1 = rider1.getReport();
        Report report2 = rider2.getReport();

        System.out.println("Rider0 " + report0.toString());
        System.out.println("Rider1 " + report1.toString());
        System.out.println("Rider2 " + report2.toString());

        int maxDeliveries = Math.max(report0.getSucessfulDeliveries(), Math.max(report1.getSucessfulDeliveries(), report2.getSucessfulDeliveries()));
        ArrayList<String> winners = new ArrayList<>();

        if (report0.getSucessfulDeliveries() == maxDeliveries) {
            winners.add("Rider0");
        }
        if (report1.getSucessfulDeliveries() == maxDeliveries) {
            winners.add("Rider1");
        }
        if (report2.getSucessfulDeliveries() == maxDeliveries) {
            winners.add("Rider2");
        }

        if (winners.size() == 1) {
            System.out.println("The winner is " + winners.get(0));
        } else {
            System.out.println("It's a tie between the following riders:");
            for (String winner : winners) {
                System.out.println(winner);
            }
        }
    }
    }

