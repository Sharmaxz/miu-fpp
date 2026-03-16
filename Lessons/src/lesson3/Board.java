package lesson3;

public class Board {

    private double length;
    private double width;
    private String color;

    public Board() {
        this.length = 0.0;
        this.width = 0.0;
        this.color = null;
    }

    public Board(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public Board(double length, double width) {
        this(length, width, "white");
    }

    public void display() {
        System.out.println("Length = " + length + "Width = " + width + "Color = " + color);
    }

    public double area() {
        double area = length * width;
        return area;
    }

    public double getParameter() {
        return 2 * (length + width);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
