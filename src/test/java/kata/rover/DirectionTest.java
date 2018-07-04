package kata.rover;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DirectionTest {

    @Test
    public void should_move_forward_to_east() {
        Coordinates coordinates = Direction.EAST.moveForward(Coordinates.of(5, 5));
        assertThat(coordinates).isEqualTo(Coordinates.of(6, 5));
    }

    @Test
    public void should_move_forward_to_west() {
        Coordinates coordinates = Direction.WEST.moveForward(Coordinates.of(5, 5));
        assertThat(coordinates).isEqualTo(Coordinates.of(4, 5));
    }

    @Test
    public void should_move_forward_to_north() {
        Coordinates coordinates = Direction.NORTH.moveForward(Coordinates.of(5, 5));
        assertThat(coordinates).isEqualTo(Coordinates.of(5, 6));
    }

    @Test
    public void should_move_forward_to_south() {
        Coordinates coordinates = Direction.SOUTH.moveForward(Coordinates.of(5, 5));
        assertThat(coordinates).isEqualTo(Coordinates.of(5, 4));
    }

    @Test
    public void should_return_EAST_on_turning_right_from_NORTH() {
        assertThat(Direction.NORTH.turnRight()).isEqualTo(Direction.EAST);
    }

    @Test
    public void should_return_SOUTH_on_turning_right_from_EAST() {
        assertThat(Direction.EAST.turnRight()).isEqualTo(Direction.SOUTH);
    }

    @Test
    public void should_return_WEST_on_turning_right_from_SOUTH() {
        assertThat(Direction.SOUTH.turnRight()).isEqualTo(Direction.WEST);
    }

    @Test
    public void should_return_NORTH_on_turning_right_from_WEST() {
        assertThat(Direction.WEST.turnRight()).isEqualTo(Direction.NORTH);
    }

    @Test
    public void should_return_WEST_on_turning_left_from_NORTH() {
        assertThat(Direction.NORTH.turnLeft()).isEqualTo(Direction.WEST);
    }

    @Test
    public void should_return_NORTH_on_turning_left_from_EAST() {
        assertThat(Direction.EAST.turnLeft()).isEqualTo(Direction.NORTH);
    }

    @Test
    public void should_return_EAST_on_turning_left_from_SOUTH() {
        assertThat(Direction.SOUTH.turnLeft()).isEqualTo(Direction.EAST);
    }

    @Test
    public void should_return_SOUTH_on_turning_left_from_WEST() {
        assertThat(Direction.WEST.turnLeft()).isEqualTo(Direction.SOUTH);
    }
}