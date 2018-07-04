package kata.rover;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsMissionTest {

    @Test
    public void should_handle_commands() {
        MarsMission marsMission = new MarsMission(World.of(5, 5), Position.of(1, 2, Direction.NORTH));

        Position position = marsMission.handle("LMLMLMLMM");

        assertThat(position).isEqualTo(Position.of(1, 3, Direction.NORTH));
    }

    @Test
    public void should_handle_commands_2() {
        MarsMission marsMission = new MarsMission(World.of(6, 6), Position.of(3, 3, Direction.EAST));

        Position position = marsMission.handle("MMRMMRMRRM");

        assertThat(position).isEqualTo(Position.of(5, 1, Direction.EAST));
    }
}