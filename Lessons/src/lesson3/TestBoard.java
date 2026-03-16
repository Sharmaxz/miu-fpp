package lesson3;

public class TestBoard
{
    public static void main(String[] args) {
        // Creating Object
        Board b = new Board();
        Board b1 = new Board(5, 5);
        Board b2 = new Board(43.12, 123.40, "white");

        b.display();
        b1.display();
        b2.display();

        double area1 = b1.area();
        double area2 = b2.area();
        print("Area of Board " + area1);
        print("Area of Board " + area2);

        double perimeter1 = b1.getParameter();
        double perimeter2 = b2.getParameter();
        print("Area of Board " + area1);
        print("Area of Board " + area2);


        Board[] boards = new Board[] { b1, b2 };

        double total = averageBoardPerimeter(boards);
        print("Average Board Perimeter: " + total);
    }

    public static double averageBoardPerimeter(Board[] boards) {
        if(boards.length == 0) {
            return 0;
        }

        double total = 0;

        for(Board board : boards) {
            total += board.getParameter();
        }

        return total / boards.length;
    }

    //region PRINT METHODS

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(Double message) {
        System.out.println(message);
    }

    //endregion PRINT METHODS
}
