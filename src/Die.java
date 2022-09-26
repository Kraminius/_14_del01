import java.util.Random;

public class Die {

    private int eyes;
    private final int maximum = 6;
    Random test = new Random();

    //Kontruktør
    public Die(int eyes){

        eyes = 1;
    }

    //Kaste terninger
    public int roll(){

        eyes = test.nextInt((maximum-1)+1)+1;
        return eyes;
    }

    //Få terningens øjne som int
    public int value(){

        return eyes;
    }

    //Udskrivnings kriterie
    public String toString(){

        String answer;
        answer = String.valueOf(eyes);
        return answer;
    }


}
