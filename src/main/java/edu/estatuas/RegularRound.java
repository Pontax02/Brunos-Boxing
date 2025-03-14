package edu.estatuas;

public class RegularRound {
    public String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;
    public RegularRound(String roundScore) {
        this.roundScore = roundScore.replace(" ","");
        this.parseRoundScore();
    };

    private String getRoundScore(){
        return this.roundScore;
    }
    private void parseRoundScore(){
        String[] score = this.roundScore.split("-",2);
        this.redBoxerScore = Byte.parseByte(score[0]);
        this.blueBoxerScore = Byte.parseByte(score[1]);
    }
    private void setredBoxerScore(){
            this.redBoxerScore =redBoxerScore;
    }
    private void setblueBoxerScore(){
            this.blueBoxerScore =blueBoxerScore;
    }







    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }


    public void boxerRoundScore() {

    }
    @Override
    public String toString(){
        return this.getRedBoxerScore()+" "+this.getBlueBoxerScore();
    }
}
