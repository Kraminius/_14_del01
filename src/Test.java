import java.util.Random;

public class Test {
    public static void main(String[] args) {
        /* her køres testen for om kravspecificeringen om at bægeret skal virke korrekt, som er specificeret
        til at være inden for 5% af normalfordelingen på 1000 kast.

        Koden er skrevet af Kenneth (s226410) og Mikkel (s224279)

        Vi tester forekomsten af alle værdierne på terningen fra 2 til 12, og udprinter forekomsten af hvert tal i
        forhold til det forventede på normalfordelingen som er med følgende sandsynligheder:
        2 & 12 = 1/36
        3 & 11 = 2/36 = 1/18
        4 & 10 = 3/36 = 1/12
        5 & 9 = 4/36 = 1/9
        6 & 8 = 5/36
        7 = 6/36 = 1/6
        */
        int
                slag1 = 0, slag2 = 0, sum = 0, sumtest = 0, to = 0,
                tre = 0, fire = 0, fem = 0, seks = 0, syv = 0, otte = 0,
                ni = 0, ti = 0, elleve = 0, tolv = 0;
        Random test = new Random();

        //For loopet regner forekomsten af alle tilfælde to til tolv sammen i en int (to - tolv) ved 1000 terningekast.
        for (int i=0; i<1000; i++ ) {
            slag1 = test.nextInt((6-1)+1)+1;
            slag2 = test.nextInt((6-1)+1)+1;
            sum = slag1 + slag2 + sum;
            sumtest = slag1 + slag2;
            System.out.println(slag1);
            System.out.println(slag2);
                switch (sumtest) {
                    case 2:
                        to = to+1;
                        break;
                    case 3:
                        tre = tre+1;
                        break;
                    case 4:
                        fire = fire+1;
                        break;
                    case 5:
                        fem = fem+1;
                        break;
                    case 6:
                        seks = seks+1;
                        break;
                    case 7:
                        syv = syv+1;
                        break;
                    case 8:
                        otte = otte+1;
                        break;
                    case 9:
                        ni = ni+1;
                        break;
                    case 10:
                        ti = ti+1;
                        break;
                    case 11:
                        elleve = elleve+1;
                        break;
                    case 12:
                        tolv = tolv+1;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + sumtest);
                }
        }
        //Printer forekomsten af hvert tilfælde (to til tolv) - normalfordelingens sandsynlighed
        System.out.println("Tallet to " + (to - 1000/36));
        System.out.println("Tallet tre " + (tre - 1000/18));
        System.out.println("Tallet fire " + (fire - 1000/12));
        System.out.println("Tallet fem " + (fem - 1000/9));
        System.out.println("Tallet seks " + (seks - (1000/36*5)));
        System.out.println("Tallet syv " + (syv - 1000/6));
        System.out.println("Tallet otte " + (otte - (1000/36*5)));
        System.out.println("Tallet ni " + (ni - 1000/9));
        System.out.println("Tallet ti " + (ti - 1000/12));
        System.out.println("Tallet elleve " + (elleve - 1000/18));
        System.out.println("Tallet tolv " + (tolv - 1000/36));
        System.out.println("Samlet sum af alle forekomster: " + sum);

        /*Printer sandt for tal indenfor normalfordelingen som er +-5% af 7000 (gennemsnit øjne ved 1000 terningekast),
        og falsk hvis øjnene er udenfor normalfordelingen.
        */

        if (sum < 7000+(7000*0.05) && sum > 7000-(7000*0.05)) {
            System.out.println("Værdien er indenfor normalfordelingen");
        }
        else {
            System.out.println("Værdien er udenfor normalfordelingen");
            //Slut på program
        }
    }
}
