import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        Rectangle rectangle = new Rectangle(reader.nextDouble(), reader.nextDouble());

        System.out.println(rectangle);
    }
}