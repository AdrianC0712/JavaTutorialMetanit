public class Variabile {
    public static void main (String args[]){

        int x;      // объявление переменной
        x = 10;     // присвоение значения
        System.out.println(x);  // 10

        int x1 = 10;     // объявление и инициализация переменной
        System.out.println(x1);  // 10

        int x2, y2;
        x2 = 10;
        y2 = 25;
        System.out.println(x2);  // 10
        System.out.println(y2);  // 25

        int x3 = 8, y3 = 15;
        System.out.println(x3);  // 8
        System.out.println(y3);  // 15

        int x4 = 10;
        System.out.println(x4);  // 10
        x4 = 25;
        System.out.println(x4);  // 25

        var x5 = 10;
        System.out.println(x5);  // 10

        final int LIMIT = 5;
        System.out.println(LIMIT);  // 5
// LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа
    }
}
