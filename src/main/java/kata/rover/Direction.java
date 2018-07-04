package kata.rover;

import java.util.Arrays;
import java.util.List;

public enum Direction {

    NORTH {
        @Override
        Coordinates moveForward(World world, Coordinates coordinates) {
            return Coordinates.of(coordinates.getX(), (coordinates.getY() + 1) % world.getHeight());
        }
    }, EAST {
        @Override
        Coordinates moveForward(World world, Coordinates coordinates) {
            return Coordinates.of((coordinates.getX() + 1) % world.getWidth(), coordinates.getY());
        }
    }, SOUTH {
        @Override
        Coordinates moveForward(World world, Coordinates coordinates) {
            return Coordinates.of(coordinates.getX(), (coordinates.getY() + world.getHeight() - 1) % world.getHeight());
        }
    }, WEST {
        @Override
        Coordinates moveForward(World world, Coordinates coordinates) {
            return Coordinates.of((coordinates.getX() + world.getWidth() - 1) % world.getWidth(), coordinates.getY());
        }
    };

    private static final List<Direction> ORDERED_DIRECTION_TURNING_RIGHT = Arrays.asList(NORTH, EAST, SOUTH, WEST);

    abstract Coordinates moveForward(World world, Coordinates coordinates);

    public Direction turnRight() {
        return ORDERED_DIRECTION_TURNING_RIGHT.get((ORDERED_DIRECTION_TURNING_RIGHT.indexOf(this) + 1) % 4);
    }

    public Direction turnLeft() {
        return ORDERED_DIRECTION_TURNING_RIGHT.get((ORDERED_DIRECTION_TURNING_RIGHT.indexOf(this) + 3) % 4);
    }
}
