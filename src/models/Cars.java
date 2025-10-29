package models;

public class Cars {
    String tipAuto, marca, color;
    Float weight;
    byte seats;

    public Cars() {

    }
    public Cars (String tipAuto,String marca, String color){
        this.tipAuto =tipAuto;
        this.marca = marca;
        this.color = color;
    }

    public String getTipAuto() {
        return tipAuto;
    }

    public void setTipAuto(String tipAuto ) {
        this.tipAuto = tipAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
