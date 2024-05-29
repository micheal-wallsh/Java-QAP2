public class TestMyRectangle {
    public static void main(String[] args) {

        // Initial Rectangle

        MyRectangle rect1 = new MyRectangle(1, 5, 4, 1);
        System.out.println("First Rect: ");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Rectangle made out of points

        MyPoint p1 = new MyPoint(2, 6);
        MyPoint p2 = new MyPoint(5, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println("Second Rect: ");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
