import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class Board extends Canvas{
    public static final long serialVersionUID = 1L;
    public static final int WIDTH = 160;
    public static final int HEIGHT = WIDTH/12 * 9;
    public static final int SCALE = 5;
    public static final String NAME = "Tic Tac Toe";
    public void Board() {
    }
    public void createFrame(){
        JFrame frame = new JFrame(NAME);
        frame.setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        frame.setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        frame.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        this.placeButtons(3);
    }


    public void placeButtons(int width){
        JButton[][] buttons = new JButton[width][width];
    }


}