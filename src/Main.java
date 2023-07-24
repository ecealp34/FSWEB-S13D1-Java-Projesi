import java.util.Scanner;

public class Main {

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (!isBarking) return false;
        return clock < 8 || clock >= 20;
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if(isSummer) {
            return temperature > 25 && temperature <= 45;
        }
        return temperature > 25 && temperature <= 35;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            System.out.println("Alan 0'dan büyük olmali.");
            return -1;
        }
        return x * y;
    }


    public static double area(double radius) {
        if(radius < 0){
            System.out.println("Alan 0'dan büyük olmali.");
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("shouldWakeUp-----");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("hasTeen-----");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("isCatPlaying-----");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("rectangleArea-----");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter width of rectangle: ");
            double x = scanner.nextDouble();
            System.out.println("Enter height of rectangle: ");
            double y = scanner.nextDouble();
            System.out.println("Rectangle Area = " + area(x, y));
        } catch (Exception ex) {
            System.out.println("Invalid input");
        }

        System.out.println("circleArea-----");
        try {
            System.out.println("Enter radius of circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Circle Area = " + area(radius));
        } catch (Exception ex) {
            System.out.println("Invalid input");
        }
    }
}