import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну из сторон квадрата:");

        double side = scanner.nextDouble();

        double area = side * 2;
        System.out.println("Площадь квадрата равна: " + area);
    }
}