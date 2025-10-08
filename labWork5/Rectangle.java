package labWork5;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 3;
        this.width = 4;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("Rectangle's length: " + rectangle.getLength());
        System.out.println("Rectangle's width: " + rectangle.getWidth());

        rectangle.setLength(4);
        System.out.println("\nRectangle's length after changes: " + rectangle.getLength());

        rectangle.setWidth(5);
        System.out.println("Rectangle's width after changes: " + rectangle.getLength());
    }
}
