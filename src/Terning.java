import java.util.Random;

public class Terning {

    private int antalØjne;
    private final int MAX = 6;
    Random test = new Random();

    //Kontruktør
    public Terning(int antalØjne){

        antalØjne = 1;
    }

    //Kaste terninger
    public int kast(){

        antalØjne = test.nextInt((MAX-1)+1)+1;
        return antalØjne;
    }

    public int værdi(){

        return antalØjne;
    }

    //Udskrivnings kriterie
    public String toString(){

        String answer;
        answer = String.valueOf(antalØjne);
        return answer;
    }


}
