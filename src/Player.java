public class Player {
    private int number; //The individual players score and number variables.
    private int score;
    public Player(int playerNumber){ //The Players class calls this to set the player number.
        number = playerNumber;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}

