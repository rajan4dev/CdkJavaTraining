import org.junit.Assert;
import org.junit.Test;


public class TicTacTest {
    @Test
    public void Xwins() {
        Character expectedOutput = 'X';
        char[][] input = {{'X', ' ', 'O'}, {'O', 'X', 'O'}, {'X', ' ', 'X'},};
        Assert.assertEquals("X Wins", expectedOutput, TicTacToeClass.output(input));
    }

    @Test
    public void inProgress() {
        Character expectedOutput = null;
        char[][] input = {{' ', ' ', ' '}, {'O', ' ', 'O'}, {'X', ' ', ' '},};
        Assert.assertEquals("in progress", expectedOutput, TicTacToeClass.output(input));
    }

    @Test
    public void OWins() {
        Character expectedOutput = 'O';
        char[][] input = {{'O', 'x', ' '},
                {'O', 'x', ' '},
                {'O', ' ', ' '},};
        Assert.assertEquals("O wins", expectedOutput, TicTacToeClass.output(input));
    }
}
