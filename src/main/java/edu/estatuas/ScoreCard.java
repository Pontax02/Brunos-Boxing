package edu.estatuas;



public class ScoreCard {
    private final String color;
    private String redCorner="";
    private String blueCorner="";

    public ScoreCard(String color, String redCorner, String blueCorner) {
        this.color = color;
        this.blueCorner = blueCorner;
        this.redCorner = redCorner;
    }



    public String getColor() {
        return this.color;

    }
    public void setRCorner(String boxerName){
        this.redCorner = boxerName;

    }
    public void setBCorner(String boxerName){
        this.blueCorner = boxerName;

    }

    @Override
    public String toString() {
        return "hola" + color;
    }
}