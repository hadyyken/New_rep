public class Massives {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for(int i = 0;i < numbers.length; i++){
            numbers[i] = i*i;
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,3,5,2};
        for(int i = 0;i<numbers1.length;i++ ){
            System.out.println(numbers1[i]);
        }
    }
}

