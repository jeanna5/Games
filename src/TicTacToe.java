
public class TicTacToe implements Game{
    public boolean running = false;
    public synchronized void start(){
        running = true;
        new Thread(this).start();
    }
    public synchronized void stop(){
        running = false;
    }
    public void run(){

        while(running){
            tick();
            render();
        }
    }

    public void tick(){

    }
    public void render(){

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
        new TicTacToe().start();
        Board board = new Board();
        board.createFrame();

    }

}