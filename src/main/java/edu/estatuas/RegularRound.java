package edu.estatuas;

    class RegularRound implements Round{
    public String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;
    public RegularRound(String roundScore) {
        this.roundScore = roundScore.replace(" ","");
        this.parseRoundScore();
    };

     String getRoundScore(){
        return this.roundScore;
    }
        private void parseRoundScore(){
        String[] score = getRoundScore().split("-",2);
        this.redBoxerScore = Byte.parseByte(score[0]);
        this.blueBoxerScore = Byte.parseByte(score[1]);
    }
    private void setredBoxerScore(){
            this.redBoxerScore =redBoxerScore;
    }
    private void setblueBoxerScore(){
            this.blueBoxerScore =blueBoxerScore;
    }






    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }
    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }



    @Override
    public String toString(){
        return this.getRedBoxerScore()+" -"+this.getBlueBoxerScore();
    }
}

