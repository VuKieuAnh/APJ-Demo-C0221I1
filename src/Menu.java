import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------MENU--------");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        while (choice != 0){
            switch (choice){
                case 1:
                    drawTriangle();
                    break;
                case 2:
                    drawSquare();
                    break;
                case 3:
                    drawRectangle();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!!!");
            }
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }
    }

    public static void drawTriangle() {
        System.out.println("Draw the triangle: ");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void drawSquare() {
        System.out.println("Draw the square: ");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
    }

    public static void drawRectangle(){
        System.out.println("Draw the rectangle: ");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
    }
}