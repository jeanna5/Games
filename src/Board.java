import javax.swing.JFrame;
import javax.swing.JButton;

public class Board{
    public void Board() {
    }
    public void createFrame(){
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);
        this.placeButtons(3);
    }
    public void placeButtons(int width){
        JButton[][] buttons = new JButton[width][width];
    }
    public void drawPanel


}