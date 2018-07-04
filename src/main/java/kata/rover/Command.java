package kata.rover;

enum Command {
    LEFT('L') {
        @Override
        public Position execute(World world, Position roverPosition) {
            return roverPosition.turnLeft();
        }
    },
    RIGHT('R') {
        @Override
        public Position execute(World world, Position roverPosition) {
            return roverPosition.turnRight();
        }
    },
    MOVE('M') {
        @Override
        public Position execute(World world, Position roverPosition) {
            return roverPosition.moveForward(world);
        }
    };

    private char code;

    Command(char code) {
        this.code = code;
    }

    public static Command fromCode(char code) {
        for (Command command : Command.values()) {
            if (command.code == code) {
                return command;
            }
        }
        throw new IllegalArgumentException("unknown command " + code);
    }

    public abstract Position execute(World world, Position roverPosition);
}
