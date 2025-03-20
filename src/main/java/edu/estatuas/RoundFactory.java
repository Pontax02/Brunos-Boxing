package edu.estatuas;

public class RoundFactory {




    public static Round getRound(String roundScore){
        if (roundScore == null) {
            return null;
        }
        if (roundScore.equals("10-9")||roundScore.equals("9-10")){
            return new RegularRound(roundScore);
        }
        else if (roundScore.equals("10 - 8")
                || roundScore.equals("8 - 10")) {
            return new KnockdownRound(roundScore);
        }
        else if (roundScore.equalsIgnoreCase("1, 8 - 10")
                || roundScore.equalsIgnoreCase("10 - 8 ,1")) {
            return new PointsDeducted(roundScore);
        }
        return null;


    }

}
