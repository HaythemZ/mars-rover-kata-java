package kata.rover;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorldTest {

    @Test
    public void should_initialize_world_size() {
        World world = new World(5, 5, Position.of(1, 2, Direction.EAST));

        assertThat(world.getRoverPosition()).isEqualTo(Position.of(1, 2, Direction.EAST));
    }

}