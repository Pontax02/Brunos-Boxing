package edu.estatuas;

public class RoundFactory {




    public static Round getRound(String roundScore){

        if (roundScore.equals("10-9")||roundScore.equals("9-10")){
            return new RegularRound(roundScore);

        }
        return null;


    }

}
