import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JButton;


public class TicTacToe implements Game{
    Board board;
    Player player1;
    Player player2;
    Player currentPlayer;

    public TicTacToe(){
        initializePlayers();
        currentPlayer = player2;
    }

    private void initializePlayers(){
        player1 = new Player("X");
        player2 = new Player("O");
    }

    protected void play(Board board) {
        while (true) {
            if (gameIsWon(board.buttons)) {
                JOptionPane.showMessageDialog(board, "Player " + currentPlayer.getMove() + " Wins");
                return;
            } else if (boardFull(board.buttons)) {
                JOptionPane.showMessageDialog(board, "Tie Game");
                return;
            }
        }
    }


    public static void main(String[] args){
        TicTacToe ttt = new TicTacToe();
        while(true) {
            ttt.board = new Board(ttt);
            ttt.play(ttt.board);
        }

    }


    public static boolean gameIsWon(ArrayList<JButton> buttons) {
        int i = 0, j = 1, k = 2, l = 0;
        for(int count = 0; count < 3; count++) {
            //check row
            if (buttons.get(i).getText().equals(buttons.get(j).getText()) && buttons.get(j).getText().equals(buttons.get(k).getText()) && !buttons.get(i).isEnabled()) {
                return true;
            }
            //check column
            if (buttons.get(l).getText().equals(buttons.get(l+3).getText()) && buttons.get(l).getText().equals(buttons.get(l+6).getText()) && !buttons.get(l).isEnabled()) {
                return true;
            }
            i+=3; j+=3; k+=3; l+=1;
        }

        //check left to right diagonal
        if (buttons.get(0).getText().equals(buttons.get(4).getText()) && buttons.get(0).getText().equals(buttons.get(8).getText()) && !buttons.get(0).isEnabled()) {
            return true;
        }
        //right to left diagonal
        if (buttons.get(2).getText().equals(buttons.get(4).getText()) && buttons.get(2).getText().equals(buttons.get(6).getText()) && !buttons.get(2).isEnabled()) {
            return true;
        }

        return false;
    }
    public static boolean boardFull(ArrayList<JButton> buttons) {
        for(JButton button : buttons) {
                if(button.isEnabled()) {
                    return false;
                }
        }
        return true;
    }



}