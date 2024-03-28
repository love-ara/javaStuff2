package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void createAnInstance(){
        turtle = new Turtle();
    }
    @Test
    public void penIsUpTest(){
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void penIsDownTest(){
        turtle.penUp();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest(){
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightWhileFacingNorthTest(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
        //assertSame(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightAndLeftAgainTest(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveFromPointTOAnotherTest(){
        turtle.move();
        assertEquals(new Position(0, 1), turtle.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveFromOnePointToAnotherByNumberOfStepTest(){
        turtle.move(4);
        assertEquals(new Position(0, 3), turtle.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveEastWardTest(){

    }
}
