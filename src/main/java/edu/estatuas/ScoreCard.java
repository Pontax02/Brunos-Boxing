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
    private Byte redBoxerFinalScore = 0;
    private Byte blueBoxerFinalScore = 0;
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


    public byte getNumRounds() {
        return (byte) this.rounds.size();
    }

    public List<Round> getRounds() {
        return Collections.unmodifiableList(this.rounds);
    }

    private void setJudgeScorecard(String[] scoreCard){
        this.judgeScoreCard = scoreCard;

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
    public int getRedBoxerFinalScore(){
        if (this.redBoxerFinalScore == 0) {
            this.redBoxerFinalScore =
                    this.getRounds()
                            .stream()
                            .map(Round::getRedBoxerScore)
                            .map(Byte::intValue)
                            .reduce(0, Integer::sum)
                            .byteValue();
        }
        return this.redBoxerFinalScore;
    }

    public int getBlueBoxerFinalScore(){
        if (this.blueBoxerFinalScore == 0) {
            this.blueBoxerFinalScore =
                    this.getRounds()
                            .stream()
                            .map(Round::getBlueBoxerScore)
                            .map(Byte::intValue)
                            .reduce(0, Integer::sum)
                            .byteValue();
        }
        return this.blueBoxerFinalScore;
    }


    @Override
    public String toString() {
        return "\n\t\t\t   " + this.color
                + "\n\t\t" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t"
                + this.getNumRounds() + " rounds\n"
                + this.viewRounds()
                + "\n\t FINAL SCORE: "
                + this.getRedBoxerFinalScore()
                + " - "
                + this.getBlueBoxerFinalScore()
                + " FINAL SCORE";

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
}