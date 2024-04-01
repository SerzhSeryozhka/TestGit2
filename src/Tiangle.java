import java.util.Scanner;

public class Tiangle {
    public static void main(String[] args) {


        System.out.println("Введите стороны треугольника");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        if ((z < x + c) && (x < z + c) && (c < z + x)) {
            double v = ((z + x + c) / 2.0);
            double p = (z + x + c);
            double s = Math.sqrt(v * (v - z) * (v - x) * (v - c));
            System.out.println("Периметр треугольника " + p);
            System.out.println("Площадь треугольника " + s);
        } else {
            System.out.println("Треугольник не возможен!");
        }
    }
}

