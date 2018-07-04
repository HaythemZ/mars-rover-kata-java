package kata.rover;

public class MarsMission {

    private final World world;
    private Position roverPosition;

    public MarsMission(World world, Position roverPosition) {
        this.world = world;
        this.roverPosition = roverPosition;
    }

    public Position handle(String commandSequence) {
        commandSequence.chars().mapToObj(c -> (char) c).map(Command::fromCode).forEach(this::applyCommand);
        return roverPosition;
    }

    private void applyCommand(Command command) {
        roverPosition = command.execute(world, roverPosition);
    }

}
