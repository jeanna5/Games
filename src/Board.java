import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;


public class Board extends JFrame implements ActionListener{
    ArrayList<ArrayList<String>> boardArray = new ArrayList<>();
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    TicTacToe game;
    public Board(TicTacToe game) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setLocation(100,100);
        setLayout(new GridLayout(3,3));
        makeButtons();
        setVisible(true);
        initializeArray();
        this.game=game;
    }
    private void makeButtons(){
        for(int i = 0; i < 9; i++) {
            buttons.add(new JButton());
            buttons.get(i).addActionListener(this);
            this.add(buttons.get(i));
        }
    }

    private void initializeArray(){
        for(int i = 0; i < 3; i++) {
            ArrayList<String> rowArr = new ArrayList<>();
            Collections.addAll(rowArr, "z", "z", "z");
            boardArray.add(rowArr);
        }
    }


    protected void printBoard(){
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j<3; j++){
                System.out.print(boardArray.get(i).get(j) + " ");
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonPressed = (JButton)e.getSource();
        game.currentPlayer = (game.currentPlayer==game.player1) ? game.player2 : game.player1;
        buttonPressed.setText(game.currentPlayer.getMove());
        buttonPressed.setEnabled(false);


    }
}