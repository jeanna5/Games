
public class TicTacToe implements Game{
    public enum Player{
        PLAYER1, PLAYER2;
    }
    //boolean[][] board = new boolean[3][3];
    @Override
    public int move(int x, int y, boolean player){
        return 0;
    }
    @Override
    public int isGameOver(int x, int y){
        return 0;
    }
    public static void main(String[] args){
        Board board = new Board();
        board.createFrame();
    }

}