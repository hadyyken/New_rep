package Less37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Less37 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;// переменная для разделения как в системе
        String path1 = "C:\\Users\\IT2.UMFC-KO\\Desktop\\test2.txt";
        String path = separator + "C:" + separator + "Users" + separator + "IT2.UMFC-KO" + separator + "Desktop" + separator + "Test.txt";
        File file = new File(path1);//стандартная переменная файла

        Scanner scanner = new Scanner(file);//переменная для считывания с экрана
        String line = scanner.nextLine();//
        String[] numbers = line.split(" ");// разделение содержимого файла по пробелам
        int[] numbersInt = new int[3];
        int counter = 0;
        for(String number: numbers){
            numbersInt [counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbersInt));
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        scanner.close();
    }
}
