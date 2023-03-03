public class Java1 {
    public static void main(String[] args) {

        byte value1 = 120;
        byte value2 = 3;
        byte value3 = (byte) (value1 + value2);
        int value = 152;
        int valueNew = 28;
        int val = 5/2;
        int val1 = 5%2;
        double val2 = 5%2;
        float val3 = 5.2F;
        int value4 = 7;
        boolean c = (value > valueNew);
        boolean b = (value == value4);
        boolean d = (value != value4);
        int value5 = Integer.MAX_VALUE;
        int x = value5 + value2;

        System.out.println("Сложение " + value1 + value2);
        System.out.println("Вычитание " + (value1 - value2));
        System.out.println("Приведение типа " + value3);
        System.out.println("Деление " + val);
        System.out.println("Остаток от деления " + val1);
        System.out.println("Остаток деления с типом bouble " + val2);
        System.out.println("Тип float " + val3);
        System.out.println("Оператор сравнения больше " + c);
        System.out.println("Оператор сравнения равно " + b);
        System.out.println("Оператор сравнения не равно " + d);
        System.out.println("Переполнение " + x);

    }
}