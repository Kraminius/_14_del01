public class HandlePoints {





    public void GivePlayerPoints(int playerNumb, Players players, SumOfDice sumOfDice){

        players.getAllPlayers()[playerNumb].setScore(players.getAllPlayers()[playerNumb].getScore() + sumOfDice.getSum());

    }

}
