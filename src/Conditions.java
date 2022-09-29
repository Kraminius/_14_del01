public class Conditions {
    /*
    0. Extra assignments.
    1. The player looses all points if the players rolls snake eyes.
    2. The player gets an extra turn if he rolls double.
    3. The player wins if he rolls double 6, in last roll and then rolls double 6 again.
    4. The player wins if he rolls double after reaching 40 points, but not if he rolls snake eyes,
    then the player looses all points
     */ //Note to describe condition set
    private boolean extraTurn, doubleSix, sixWin, forty, win, oneHit;
    //Method one to check both double turn, snake eyes and double 6. (Condition 1, 2 and 3)
    public void CheckConditions(int[] rollDice, Player player){ //Uses the dice rolls and the assigned Player
        sixWin = false;
        if (rollDice[0] == rollDice[1]){ //Checks if both rolled dice shows the same eyes

            //Extra assignment 1.
            if (rollDice[0] == 1){ //If you roll ones your score is set to 0
                player.setScore(0);
                oneHit =true;
                // put 1 here maybe
            }
            else if (rollDice[0] == 6){ //If you roll sixes you either get the chance to win next round or win this round.
                if (doubleSix){
                    sixWin = true;
                }
                doubleSix = true;
                extraTurn = true;
            }
            else { //If you roll other than one or six you get an extra turn, and cant win with sixes next round
                extraTurn = true;
                doubleSix = false;
            }
        }
        else{ //You didn't roll the same and therefore don't get another turn or get the chance to win with sixes.
            doubleSix = false;
            extraTurn = false;
        }
    }

    public void StartTurn(){ //Sets booleans to be false on the very first turn
        extraTurn = false;
        oneHit = false;
    }
    public void OverForty(Player player){//Checks if the player has a score over forty
        if(player.getScore() >= 40){
            forty = true;
        }
        else{
            forty = false;
        }
    }
    public void WinCondition(RollDice rollDice){ //Checks if the win conditions are met.
        if(forty && extraTurn){
            win = true;
        }
        else if(doubleSix && sixWin){
           win = true;
        }
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }

    public void setExtraTurn(boolean extraTurn) {
        this.extraTurn = extraTurn;
    }

    public boolean isWinnerSix() {
        return doubleSix;
    }

    public void setWinnerSix(boolean winnerSix) {
        this.doubleSix = winnerSix;
    }

    public boolean isSixWin() {
        return sixWin;
    }

    public void setSixWin(boolean sixWin) {
        this.sixWin = sixWin;
    }

    public boolean isForty() {
        return forty;
    }

    public void setForty(boolean forty) {
        this.forty = forty;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isOneHit() {
        return oneHit;
    }

    public void setOneHit(boolean oneHit) {
        this.oneHit = oneHit;
    }
}
