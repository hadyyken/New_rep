import java.util.Scanner;

public class Class2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = s.nextInt();
        switch (age){
            case 0:
                System.out.println("Hello world!");
                break;
            case 6:
                System.out.println("You are 6 years");
                break;
            case 17:
                System.out.println("You are 17 Years");
                break;
            default:
                System.out.println("Вам "+ age +" лет" );
        }
    }
}
