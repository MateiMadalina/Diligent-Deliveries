package com.codecool.diligentdeliveries;

import java.util.Arrays;

public class Address {
    private final int[] zipCode;
    private final String streetAddress;
    private final String customersName;

    public Address(int[] zipCode, String streetAddress, String customersName) {
        this.zipCode = zipCode;
        this.streetAddress = streetAddress;
        this.customersName = customersName;
    }

    public int[] getZipCode() {
        return zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCustomersName() {
        return customersName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + Arrays.toString(zipCode) +
                ", streetAddress='" + streetAddress + '\'' +
                ", customersName='" + customersName + '\'' +
                '}';
    }
}
