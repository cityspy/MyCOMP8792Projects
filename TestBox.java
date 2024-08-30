public class TestBox {
    public static void main(String[] args) {
        // Input data from the example in the image
        int width = 24;
        int height = 25;
        int depth = 63;
        String builder = "Henry ";

        // Create Box objects and print their information
        Box a = new Box(width, height, depth);
        System.out.println(a.printMe());

        Box b = new Box(width, height, depth, builder);
        System.out.println(b.printMe());
    }
}
