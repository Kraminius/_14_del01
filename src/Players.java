public class Players {

    private Player[] allPlayers;



    public Players(int numberOfPlayers){


        allPlayers = new Player[numberOfPlayers];

        for(int i =0; i<numberOfPlayers; i++){

            allPlayers[i] = new Player(i+1);



        }



    }

    public Player[] getAllPlayers() {
        return allPlayers;
    }

    public void setAllPlayers(Player[] allPlayers) {
        this.allPlayers = allPlayers;
    }
}

