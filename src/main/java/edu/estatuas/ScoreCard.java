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
    public String getRcorner(){
        return this.redCorner;
    }
    public String getBcorner(){
        return this.blueCorner;
    }

    @Override
    public String toString() {
        return "\t\t\t\t\t" + this.getColor() + "\n\t\t " + this.getRcorner() + "\t " + this.getBcorner() + "\n\tRound \t Score \t Round \t Score \t Round\n \tScore\tTotal\t\t\t Total\tScore";
    }
}