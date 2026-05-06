package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private boolean occupied;
    private double price;
    private boolean dirty;


    public Room() {
    }

    public Room(int numberOfBeds, boolean occupied, double price, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.price = price;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable(){
        return !dirty && !occupied;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", occupied=" + occupied +
                ", price=" + price +
                ", dirty=" + dirty +
                ", available=" + isAvailable() +
                '}';
    }
    public void checkIn(){
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Guest successfully checked in.");
        } else {
            System.out.println("Room cannot be checked in. It is either occupied or dirty.");
        }
    }
    public void checkOut(){
        if(occupied){
            occupied = false;
            dirty = true;
            System.out.println("Guest has successfully checked out.");
        }
    }
    public void cleanRoom(){

            if(!occupied && dirty){
                dirty = false;
                System.out.println("Room has been cleaned.");
            }
        }

}
