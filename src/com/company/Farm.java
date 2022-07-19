package com.company;

public class Farm {
    private String ownerName;
    private String address;
    private String cows;
    private String horses;
    private String sheep;

    public Farm() {
    }

    public Farm(String ownerName, String address, String cows, String horses, String sheeps) {
        this.ownerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCows() {
        return cows;
    }

    public void setCows(String cows) {
        this.cows = cows;
    }

    public String getHorses() {
        return horses;
    }

    public void setHorses(String horses) {
        this.horses = horses;
    }

    public String getSheeps() {
        return sheep;
    }

    public void setSheeps(String sheeps) {
        this.sheep = sheeps;
    }
}
