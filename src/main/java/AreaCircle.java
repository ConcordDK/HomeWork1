import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Площадь круга равна: " + area);
    }
}
