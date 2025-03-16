package edu.estatuas;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collections;


public class ScoreCard {
    private final String color;
    private String redCorner="";
    private String blueCorner="";
    public String[] judgeScoreCard;
    private List<Round> rounds = new ArrayList<Round>();

    public ScoreCard(String color, String redCorner, String blueCorner) {
        this.color = color;
        this.blueCorner = blueCorner;
        this.redCorner = redCorner;

    }
    private void addRound(Round round) {
        this.rounds.add(round);
    }
    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.setJudgeScorecard(judgeScoreCard);

        Optional<Round> round = Optional.empty();
        for(String roundScore : this.judgeScoreCard) {
            round = Optional.ofNullable(RoundFactory.getRound(roundScore));
            round.ifPresent(this::addRound);
        }
    }






    private void setJudgeScorecard(String[] data){
        this.judgeScoreCard = data;

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
    private int getRedBoxerFinalScore(){

    }
    private int getBlueBoxerFinalScore(){

    }
    private String viewRounds() {

        StringBuilder roundsView = new StringBuilder();
        roundsView.append("\tRound \t Score \t Round \t Score \t Round\n")
                .append("\tScore \t Total \t       \t Total \t Score");

        byte roundNum = 1;

        byte redBoxerScoreTotal = 0;
        byte blueBoxerScoreTotal = 0;

        for(Round round : this.rounds) {
            roundsView.append("\n\t")
                    .append(round.getRedBoxerScore())
                    .append("\t\s")
                    .append(redBoxerScoreTotal += round.getRedBoxerScore())
                    .append("\t\s\s")
                    .append(roundNum++)
                    .append("\t\s")
                    .append(blueBoxerScoreTotal += round.getBlueBoxerScore())
                    .append("\t\s")
                    .append(round.getBlueBoxerScore());
        }
        return roundsView.toString();
    }

    @Override
    public String toString() {
        return "\t\t\t\t\t" + this.getColor() + "\n\t\t " + this.getRcorner() + "\t " + this.getBcorner() + "\n\tRound \t Score \t Round \t Score \t Round\n \tScore\tTotal\t\t\t Total\tScore" + this.viewRounds();
    }
}