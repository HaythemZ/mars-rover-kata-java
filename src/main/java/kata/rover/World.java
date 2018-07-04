package kata.rover;

public class World {

    private final int height;
    private final int width;
    private final Position roverPosition;

    public World(int height, int width, Position roverPosition) {
        this.height = height;
        this.width = width;
        this.roverPosition = roverPosition;
    }

    public Position getRoverPosition() {
        return roverPosition;
    }

}
