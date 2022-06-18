package ua.ithillel.lms;

public class Square {

    static int side;
    static int perimeter;
    static int sqar;
    boolean b;
    static String ap = "Периметр равен площади:";

    public static void printInfo() {
        perimeter = 4*side;
        sqar = side*side;
        boolean b = (sqar == perimeter);

        System.out.println("Сторона квадрата:" +side);
        System.out.println("Площадь квадрата:" +sqar);
        System.out.println("Периметр квадрата:" +perimeter);
        System.out.println(ap+b);
    }
}






