import java.util.Scanner;

public class Helloworld {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int value;
        do {
            System.out.println("Go 5");
            value = s.nextInt();
        }while (value!=5);
        System.out.println("Yes");
    }
}
