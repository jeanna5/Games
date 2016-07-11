public interface Game extends Runnable{
    public int move(int x, int y, boolean player);
    public int isGameOver(int x, int y);
}

