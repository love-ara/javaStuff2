package fireDrill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private  TicTacToe game;


    @BeforeEach
    public void createAnInstance(){
        game = new TicTacToe();
    }

    @Test
    public void theFirstPlayerPlaysTypeXTest(){
        assertEquals(CellType.X, game.currentPlayer());
    }

    @Test
    public void boardDisplaysEmptyAtTheInitialStageTest(){
        String expectedBoard = """
                   EMPTY   EMPTY   EMPTY
                   EMPTY   EMPTY   EMPTY
                   EMPTY   EMPTY   EMPTY
                """;
       assertEquals(expectedBoard, game.displayBoard());
    }

    @Test
    public void theFirstPlayerCanPlayTest(){
        assertTrue(game.makeMove(3));
    }
    @Test
    public void isValidMoveTest(){
        assertTrue(game.isValidMove(5));
    }
    @Test
    public void playerChangesAfterAValidMoveTest(){
        CellType player = CellType.X;
        assertEquals(player, game.currentPlayer());
        game.makeMove(3);
        CellType player2 = CellType.O;
        assertEquals(player2, game.currentPlayer());
    }

    @Test
    public void invalidMoveThrowsInvalidMoveExceptionTest(){
        assertThrows(InvalidMoveException.class, ()-> game.makeMove(10));
    }
    @Test
    public void isWin_atHorizontalTest(){
        game.makeMove(1);
        game.makeMove(4);
        game.makeMove(2);
        game.makeMove(5);
        game.makeMove(3);
        assertTrue(game.isWin());
    }
    @Test
    public void isWin_atVerticalTest(){
        game.makeMove(2);
        game.makeMove(1);
        game.makeMove(5);
        game.makeMove(9);
        game.makeMove(8);
        assertTrue(game.isWin());
    }

    @Test
    public void isWin_atDiagonalTest(){
        game.makeMove(2);
        game.makeMove(1);
        game.makeMove(4);
        game.makeMove(5);
        game.makeMove(8);
        game.makeMove(9);
        assertTrue(game.isWin());
    }

    @Test
    public void isWin_atDiagonalTwoTest(){
        game.makeMove(3);
        game.makeMove(8);
        game.makeMove(5);
        game.makeMove(1);
        game.makeMove(7);
        assertTrue(game.isWin());
    }
    @Test
    public void playersHaveATieTest(){
        game.makeMove(5);
        game.makeMove(3);
        game.makeMove(7);
        game.makeMove(8);
        game.makeMove(2);
        game.makeMove(4);
        game.makeMove(6);
        game.makeMove(1);
        assertTrue(game.isDraw());
    }
    @Test
    public void playerPlaysOnAnInvalidPosition_throwsInvalidPositionTest(){
        game.makeMove(2);
        game.makeMove(3);
        //game.makeMove(3);
        assertThrows(InvalidPositionException.class,()-> game.makeMove(3));
    }
    @Test
    public void playerPlaysOnAlreadyMe_throwsInvalidPositionTest(){
        game.makeMove(2);
        game.makeMove(3);
        assertThrows(InvalidPositionException.class,()-> game.makeMove(3));
        assertThrows(InvalidPositionException.class,()-> game.makeMove(3));
        assertThrows(InvalidPositionException.class,()-> game.makeMove(2));
    }
}
