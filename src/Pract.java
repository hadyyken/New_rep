import java.util.Date;
import java.util.Scanner;
public class Pract {
    public static void main(String[] args) {
       // Пользователь вводит два числа. Найдите сумму и произведение данных чисел.
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int value = s.nextInt();
        int value2 = s.nextInt();
        System.out.println("Результат суммы этих чисел: " + Test.sum(value,value2));
        System.out.println("Результат перемножения этих чисел: " + Test.proizv(value,value2));
        // ВОЗВЕДЕНИЕ ЗНАЧЕНИЙ В КВАДРАТ С ПОМОЩЬЮ МЕТОДОВ КЛАССА TEST
        int value3 = s.nextInt();
        System.out.println("Квадрат числа: " + Test.square(value3));
        System.out.println("Куб числа"+ Test.cube(value3));
    }
}
class Test{
    static int square(int a) {
        return a * a;
    }
    static int cube(int a){
        return a*a*a;
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int proizv(int a, int b){
        return a * b;
    }
}