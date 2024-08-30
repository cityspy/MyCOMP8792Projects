public class Box {
    private int width;
    private int height;
    private int depth;
    private String builder;

    // Constructor without builder
    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.builder = null; // Set builder to null if not provided
    }

    // Constructor with builder
    public Box(int width, int height, int depth, String builder) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.builder = builder.trim(); // Trim any spaces around the builder's name
    }

    // Method to generate the output string
    public String printMe() {
        String result = "Box built.\n";
        result += "  Width: " + width + "\n";
        result += "  Height: " + height + "\n";
        result += "  Depth: " + depth + "\n";
        result += "  Built by " + builder; // Remove the newline character at the end
        return result;
    }
}
