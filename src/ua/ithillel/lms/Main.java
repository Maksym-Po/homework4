package ua.ithillel.lms;

public class Main {


    public static void main(String[] args) {
        Square sideSquare = new Square();
        sideSquare.side = 2;

        System.out.println(sideSquare);
        Square.printInfo();

        Square sideSquare1 = new Square();
        sideSquare1.side = 4;

        System.out.println(sideSquare);
        Square.printInfo();


        byte i = 127;
        short a = i;
        int c = a;
        long b = c;
        boolean z = i == b;

        System.out.println("byte " + i);
        System.out.println("sort " + a);
        System.out.println("int " + c);
        System.out.println("long " + b);
        System.out.println("Без потери точности:" + z);


        int q = 3352525;
        double v = q;
        boolean z1 = q == v;

        System.out.println("int " + q);
        System.out.println("double " + v);
        System.out.println("Без потери точности:" + z1);


        short a1 = 3263;
        float b1 = a1;
        double c1 = b1;
        boolean z2 = a1 == c1;

        System.out.println("sort " + a1);
        System.out.println("float " + b1);
        System.out.println("double " + c1);
        System.out.println("Без потери точности:" + z2);


        char a2 = 14141;
        int b2 = a2;
        boolean z3 = a2 == b2;

        System.out.println("char " + a2);
        System.out.println("int " + b2);
        System.out.println("Без потери точности:" + z3);


        int d3 = 2147483647;
        float c3 = d3;

        System.out.println("int " + d3);
        System.out.println("float " + c3);


        byte i4 = 127;
        ++i4;

        System.out.println(i4);
        // 127 в двоичном представлении - 01111111.
        // Если к этому числу добавить 1, то получится 10000000 (-128), то есть увеличивая число, мы "залезли" в знаковый бит и превратили число в самое маленькое отрицательное, которое может содержать тип byte


    }
}