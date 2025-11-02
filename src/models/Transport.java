package models;

public class Transport {
    String tipAuto, model, color, licensePlate;
    Float weight;
    short maxSpeed;
    byte seats;

    public Transport() {

    }

    public Transport(String tipAuto, String model, byte seats, short maxSpeed, String licensePlate, String color) {
        this.tipAuto = tipAuto;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.licensePlate = licensePlate;
        this.seats = seats;
    }
    // public Transport

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getTipAuto() {
        return tipAuto;
    }

    public short getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(short maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTipAuto(String tipAuto) {
        this.tipAuto = tipAuto;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }
}
