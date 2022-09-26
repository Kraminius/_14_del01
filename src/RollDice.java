import java.util.Random;

public class RollDice {

    private int []ourRolls;

    private final int numberOfRolls = 2;
    private Die die = new Die();
    public void Roll(){
        ourRolls = new int[numberOfRolls];
        Random random = new Random();

        for (int i = 0;i<numberOfRolls;i++){
            ourRolls[i] = random.nextInt((die.getMaximum()- die.getMinimum())+1)+1;

        }
    }

    public int[] getOurRolls() {
        return ourRolls;
    }

    public void setOurRolls(int[] ourRolls) {
        this.ourRolls = ourRolls;
    }
}
