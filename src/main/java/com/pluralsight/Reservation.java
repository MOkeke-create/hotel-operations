package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getPrice(){
        double pricePerNight = 0;

        if (roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139;
        }
        else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124;
        }

        // Weekend price increase
        if (weekend) {
            pricePerNight = pricePerNight * 1.10;
        }

        return pricePerNight * numberOfNights;
    }

    @Override
    public String toString() {
        return "Reservation" +
                "roomType = " + roomType + '\'' +
                ", numberOfNights = " + numberOfNights +
                ", weekend = " + weekend +
                ", Price = " + getPrice();
    }
}
