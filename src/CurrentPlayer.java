public class CurrentPlayer {


    private int currentPlayerNumberVar;
    private int currentPlayerNumber;


    public CurrentPlayer(){


        currentPlayerNumberVar = 1;
        currentPlayerNumber = 1;

    }

    public void checkCurrentPlayer(Players players){

        if(currentPlayerNumberVar < players.getAllPlayers().length){

            currentPlayerNumberVar += 1;
            currentPlayerNumber = 1;

        }
        else {


            currentPlayerNumberVar = 1;
            currentPlayerNumber =2;


        }


    }

    public int getCurrentPlayerNumberVar() {
        return currentPlayerNumberVar;
    }

    public void setCurrentPlayerNumberVar(int currentPlayerNumberVar) {
        this.currentPlayerNumberVar = currentPlayerNumberVar;
    }

    public int getCurrentPlayerNumber() {
        return currentPlayerNumber;
    }

    public void setCurrentPlayerNumber(int currentPlayerNumber) {
        this.currentPlayerNumber = currentPlayerNumber;
    }
}
