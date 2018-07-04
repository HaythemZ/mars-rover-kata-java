package kata.rover;

import java.util.Arrays;
import java.util.List;

public enum Direction {

    NORTH {
        @Override
        Coordinates moveForward(Coordinates coordinates) {
            return Coordinates.of(coordinates.getX(), coordinates.getY() + 1);
        }
    }, EAST {
        @Override
        Coordinates moveForward(Coordinates coordinates) {
            return Coordinates.of(coordinates.getX() + 1, coordinates.getY());
        }
    }, SOUTH {
        @Override
        Coordinates moveForward(Coordinates coordinates) {
            return Coordinates.of(coordinates.getX(), coordinates.getY() - 1);
        }
    }, WEST {
        @Override
        Coordinates moveForward(Coordinates coordinates) {
            return Coordinates.of(coordinates.getX() - 1, coordinates.getY());
        }
    };

    private static final List<Direction> ORDERED_DIRECTION_TURNING_RIGHT = Arrays.asList(NORTH, EAST, SOUTH, WEST);

    abstract Coordinates moveForward(Coordinates coordinates);

    public Direction turnRight() {
        return ORDERED_DIRECTION_TURNING_RIGHT.get((ORDERED_DIRECTION_TURNING_RIGHT.indexOf(this) + 1) % 4);
    }

    public Direction turnLeft() {
        return ORDERED_DIRECTION_TURNING_RIGHT.get((ORDERED_DIRECTION_TURNING_RIGHT.indexOf(this) + 3) % 4);
    }
}
