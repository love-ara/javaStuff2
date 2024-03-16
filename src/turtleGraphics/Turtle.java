package turtleGraphics;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0, 0);

    public boolean isPenUp() {
        return isPenUp;
    }
    public void penDown(){
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public  void turnLeft(){
        if(currentDirection == Direction.SOUTH) currentDirection = Direction.EAST;
        if(currentDirection == Direction.WEST) currentDirection = Direction.SOUTH;
        if(currentDirection == Direction.NORTH) currentDirection = Direction.WEST;
        if(currentDirection == Direction.EAST) currentDirection = Direction.NORTH;
    }

    public void turnRight() {
        if(currentDirection == Direction.NORTH) currentDirection = Direction.EAST;
        if(currentDirection == Direction.WEST) currentDirection = Direction.NORTH;
        if(currentDirection == Direction.SOUTH) currentDirection = Direction.WEST;
        if(currentDirection == Direction.EAST) currentDirection = Direction.SOUTH;
    }


    public void move() {
        int oneStep = currentPosition.getColumn() + 1;
        currentPosition = new Position(currentPosition.getRow(), oneStep);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfStep) {
       int positionOfStep = currentPosition.getColumn() + numberOfStep;
       currentPosition = new Position(currentPosition.getRow(), positionOfStep - 1);
    }
}
