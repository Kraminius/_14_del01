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


                StartPlayerTurn(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber()-1], conditions);
                RollProcess(players.getAllPlayers()[currentPlayer.getCurrentPlayerNumber()-1], conditions);
                if(conditions.isWin()){
                    conditions.setExtraTurn(false);
                }

            }while (conditions.isExtraTurn());

        }
        while (!conditions.isWin());



    }



    public void StartPlayerTurn(Player player, Conditions conditions){



        //Sets start conditions variables
        conditions.StartTurn();
        conditions.OverForty(player);

        //Player needs to press something to start turn
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        display.startText(player);
        scanner.nextLine();

    }

    public void RollProcess(Player player,Conditions conditions){

        //Rolls
        RollDice rollDice = new RollDice();
        rollDice.Roll();


        //Checks conditions
        conditions.CheckConditions(rollDice.getOurRolls(),player);

        //Calculates the total sum
        SumOfDice sumOfDice = new SumOfDice();
        sumOfDice.calcSum(rollDice);

        //Checks if player won
        conditions.WinCondition(rollDice);

        //Calculates player total points
        HandlePoints handlePoints = new HandlePoints();

        Display display = new Display();
        if(sumOfDice.getSum()!=2){
            handlePoints.GivePlayerPoints(player, sumOfDice);
        }

        if (conditions.isWin()){
            display.RollText(rollDice);
            display.winningGameText(player);
        }
        else{
            display.RollText(rollDice);
            display.turnText(player, rollDice,conditions);
        }




    }




}
