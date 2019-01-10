public class ThirteensGUIRunner {

        /**
         * Plays the GUI version of Elevens.
         * @param args is not used.
         */
        public static void main(String[] args) {
            Board board = new ThirteensBoard();
            board.newGame();
            CardGameGUI gui = new CardGameGUI(board);
            gui.displayGame();
        }
    }

