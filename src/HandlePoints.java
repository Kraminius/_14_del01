public class HandlePoints {


    Players players = new Players();
    SumOfDice sumOfDice = new SumOfDice();


    public void GivePlayerPoints(int playerNumb){

        players.getAllPlayers()[playerNumb].setScore(players.getAllPlayers()[playerNumb].getScore() + sumOfDice.getSum());

    }

}
