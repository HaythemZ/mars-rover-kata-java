package kata.rover;

public class World {

    private final int height;
    private final int width;

    private World(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static World of(int height, int width) {
        return new World(height, width);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
