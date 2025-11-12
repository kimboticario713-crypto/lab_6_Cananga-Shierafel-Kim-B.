class Rectangle{
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }
}

public class RectangleDemo{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 8.5;
        rect.width = 4.2;

        System.out.println("Rectangle Details:");
        System.out.println("Length:" + rect.length);
        System.out.println("Width:" + rect.width);
        System.out.println("Area:" + rect.calculateArea());
    }
}
