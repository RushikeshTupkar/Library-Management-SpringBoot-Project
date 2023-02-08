package com.example.Library.Management.Project.model;

public class Library {
    private String name;
    private String address;
    private String number;
    private String facilities;

    public Library(String name, String address, String number, String facilities, int monthlyFees) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
        this.monthlyFees = monthlyFees;
    }
    public Library(String name){
        this.name = name;
    }

    private int monthlyFees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getMonthlyFees() {
        return monthlyFees;
    }

    public void setMonthlyFees(int monthlyFees) {
        this.monthlyFees = monthlyFees;
    }
}
