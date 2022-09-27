package Game;

public class HandlePoints {





    public void GivePlayerPoints(Player player, SumOfDice sumOfDice){

        player.setScore(player.getScore() + sumOfDice.getSum());

    }

}
