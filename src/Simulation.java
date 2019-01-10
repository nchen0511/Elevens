public class Simulation {
    public static void main(String[] args)
    {
        while(true)
        {
            Board board = new ElevensBoard();
            board.newGame();
            while(!board.isEmpty() && board.anotherPlayIsPossible())
            {

            }
        }
    }
    public void makePair(){

    }
}
