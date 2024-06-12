public class Tipuri_Date {
    public static void main (String args[]){
        //boolean: хранит значение true или false
        boolean isActive = false;
        boolean isAlive = true;

        //byte: хранит целое число от -128 до 127 и занимает 1 байт
        byte a = 3;
        byte b = 8;

        //short: хранит целое число от -32768 до 32767 и занимает 2 байта
        short a1 = 3;
        short b1 = 8;

        //int: хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int a2 = 4;
        int b2 = 9;

        //long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long a3 = 5;
        long b3 = 10;

        //double: хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
        double x = 8.5;
        double y = 2.7;

        //float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        float x1 = 8.5F;
        float y1 = 2.7F;

        char ch=102; // символ 'f'
        System.out.println(ch);

        String hello = "Hello...";
        System.out.println(hello);

        String text = "Hello \nworld";
        System.out.println(text);

        String text1 = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(text1);

        String text2 = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text2);
    }
}
