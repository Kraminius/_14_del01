public class Conditions {

    /*
    0. Extra assignments.
    1. The player looses all points if the players rolls snake eyes.
    2. The player gets an extra turn if he rolls double.
    3. The player wins if he rolls double 6, in last roll and then rolls double 6 again.
    4. The player wins if he rolls double after reaching 40 points, but not if he rolls snake eyes,
    then the player looses all points
     */

    private boolean extraTurn, winnerSix;
    //Method one to check both double turn, snake eyes and double 6. (Condition 1, 2 and 3)
    public void CheckConditions(RollDice rollDice, Players players, int playerNumber){
        if (rollDice.getOurRolls()[0] == rollDice.getOurRolls()[1]){
            //Extra assignment 1.
            if (rollDice.getOurRolls()[0] == 1){
                players.getAllPlayers()[playerNumber].setScore(0);
                //If you lose your turn by rolling 1,1, delete extraTurn on below line. Check with customer. !!!!
                extraTurn = true;
            }
            else if (rollDice.getOurRolls()[0] == 6){
                winnerSix = true;
                extraTurn = true;
            }
            else {
                extraTurn = true;
            }
        }
    }


}
