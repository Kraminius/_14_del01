public class SumOfDice {
    private int sum;

    public void calcSum(RollDice rollDice){ //Calculates sum of int[]
        sum = 0;
        for(int i = 0; i < rollDice.getOurRolls().length; i++){
            sum += rollDice.getOurRolls()[i];
        }
    }



    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
