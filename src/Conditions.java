public class Conditions {

    /*
    0. Extra assignments.
    1. The player looses all points if the players rolls snake eyes.
    2. The player gets an extra turn if he rolls double.
    3. The player wins if he rolls double 6, in last roll and then rolls double 6 again.
    4. The player wins if he rolls double after reaching 40 points, but not if he rolls snake eyes,
    then the player looses all points
     */

    private boolean extraTurn, winnerSix, sixTurn, forty, win;
    //Method one to check both double turn, snake eyes and double 6. (Condition 1, 2 and 3)
    public void CheckConditions(int[] rollDice, Player player){
        sixTurn = false;
        if (rollDice[0] == rollDice[1]){

            //Extra assignment 1.
            if (rollDice[0] == 1){
                player.setScore(0);
                // put 1 here maybe
            }
            else if (rollDice[0] == 6){
                if (winnerSix == true){
                    sixTurn = true;
                }
                winnerSix = true;
                extraTurn = true;

            }
            else {

                extraTurn = true;
            }
        }
        else{
            winnerSix = false;
            extraTurn = false;
        }
    }

    public void startTurn(){
        extraTurn = false;
    }

    public void overForty(Player player){
        if(player.getScore() >= 40){
            forty = true;
        }
        else{
            forty = false;
        }
    }

    public void WinCondition(RollDice rollDice){
        if(forty == true && extraTurn == true){
            win = true;
        }
        else if(winnerSix == true && sixTurn == true){
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
        return winnerSix;
    }

    public void setWinnerSix(boolean winnerSix) {
        this.winnerSix = winnerSix;
    }

    public boolean isSixTurn() {
        return sixTurn;
    }

    public void setSixTurn(boolean sixTurn) {
        this.sixTurn = sixTurn;
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
}
