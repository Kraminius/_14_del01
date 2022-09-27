public class Display {

    //Efter input fra kunden, vil vi sætte die1 og die2 på hver sin linjen
    //Efter input fra kunden, skal der ønskes tillykke hver gang man slår dobbelt

    public void startText(Player player){

        System.out.print("Player " + player.getNumber() +
                " turn. Click something to roll!");
        System.out.println();

    }

    public void turnText(Player player, RollDice rollDice, Conditions conditions){

        if(conditions.isOneHit()){

            System.out.println("Player"+player.getNumber() + " hit double 1 and lost all his points");
            System.out.println("Total sum for player" + player.getNumber() + ": "+ player.getScore());
            System.out.println();

        }
        else if(conditions.isExtraTurn()){

            if(rollDice.getOurRolls()[0] != 6){
                System.out.println("Total sum for player" + player.getNumber() + ": "+ player.getScore());
                System.out.println("Player " + player.getNumber() +
                        " hit double " + rollDice.getOurRolls()[0] + ". Roll again!");
            }
            else{
                System.out.println("Total sum for player" + player.getNumber() + ": "+ player.getScore());
                System.out.println("Player " + player.getNumber() +
                        " hit double " + rollDice.getOurRolls()[0] + ". Roll double 6 again to win the game!");
            }

        }else {
            System.out.println("Total sum for player" + player.getNumber() + ": "+ player.getScore());
            System.out.println();
        }

    }

    public void winningGameText(Player player){

        System.out.println("Player"+ player.getNumber() + " won the game!!");

    }

    public void RollText(RollDice rollDice){

        System.out.println("Die 1: " + rollDice.getOurRolls()[0]);
        System.out.println("Die 2: " + rollDice.getOurRolls()[1]);
    }



}
