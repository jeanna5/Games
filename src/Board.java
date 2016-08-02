import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Board extends JFrame implements ActionListener{
    //ArrayList<ArrayList<String>> boardArray = new ArrayList<>();
    ArrayList<JButton> buttons;
    TicTacToe game;
    public Board(TicTacToe game) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setLocation(100,100);
        setLayout(new GridLayout(3,3));
        makeButtons();
        setVisible(true);
        this.game=game;
    }
    private void makeButtons(){
        buttons = new ArrayList<JButton>();
        for(int i = 0; i < 9; i++) {
            buttons.add(new JButton());
            buttons.get(i).addActionListener(this);
            this.add(buttons.get(i));
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