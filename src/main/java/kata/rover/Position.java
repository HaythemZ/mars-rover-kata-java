package kata.rover;

import java.util.Objects;

public class Position {

    private final Coordinates coordinates;
    private final Direction direction;

    private Position(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public static Position of(int x, int y, Direction direction) {
        return new Position(Coordinates.of(x, y), direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(coordinates, position.coordinates) &&
                direction == position.direction;
    }

    @Override
    public int hashCode() {

        return Objects.hash(coordinates, direction);
    }

    @Override
    public String toString() {
        return "Position{" +
                "coordinates=" + coordinates +
                ", direction=" + direction +
                '}';
    }
}
