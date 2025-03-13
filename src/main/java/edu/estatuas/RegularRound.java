package edu.estatuas;

public class RegularRound implements Round{
    public String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;
    public RegularRound(String roundScore) {
        this.roundScore = roundScore;

    };

    private String getRoundScore(){
        return this.roundScore;
    }
    private void parseRoundScore(String roundScore){

    }
    private void setredBoxerScore(){
            this.redBoxerScore =redBoxerScore;
    }
    private void setblueBoxerScore(){
            this.blueBoxerScore =blueBoxerScore;
    }
    @Override
    public byte getredBoxerScore() {
        return this.getredBoxerScore();
    }

    @Override
    public byte getblueBoxerScore() {
        return this.getblueBoxerScore();
    }

    @Override
    public void boxerRoundScore() {

    }
}
