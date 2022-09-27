import java.util.Scanner;

public class Game {



    public Game(int howManyPlayers){

        Players players = new Players(howManyPlayers);
        Conditions conditions = new Conditions();
        CurrentPlayer currentPlayer = new CurrentPlayer();
        do{
            conditions.setExtraTurn(true);
            currentPlayer.checkCurrentPlayer(players);
            do{


                StartPlayerTurn(players.getAllPlayers()[currentPlayer.currentPlayerNumber-1], conditions);
                RollProccess(players.getAllPlayers()[currentPlayer.currentPlayerNumber-1], conditions);
                if(conditions.isWin()){
                    conditions.setExtraTurn(false);
                }

            }while (conditions.isExtraTurn());

        }
        while (!conditions.isWin());


    }



    public void StartPlayerTurn(Player player, Conditions conditions){



        //Sets start conditions variables
        conditions.startTurn();
        conditions.overForty(player);

        //Player needs to press something to start turn
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + player.getNumber() +
                " turn. Click something to roll!");
        scanner.nextLine();

    }

    public void RollProccess(Player player,Conditions conditions){

        //Rolls
        RollDice rollDice = new RollDice();
        rollDice.Roll();

        System.out.println("Die1: " + rollDice.getOurRolls()[0] + " Die2: " + rollDice.getOurRolls()[1]);

        //Checks conditions
        conditions.CheckConditions(rollDice.getOurRolls(),player);

        //Calculates the total sum
        SumOfDice sumOfDice = new SumOfDice();
        sumOfDice.calcSum(rollDice);

        //Checks if player won
        conditions.WinCondition(rollDice);

        //Calculates player total points
        HandlePoints handlePoints = new HandlePoints();
        if(sumOfDice.getSum()!=2){
            handlePoints.GivePlayerPoints(player, sumOfDice);
        }


        System.out.println("Total sum for player " + player.getScore());

    }



}
