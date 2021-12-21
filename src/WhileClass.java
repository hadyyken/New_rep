public class WhileClass {
    public static void main(String[] args) {
//        int i = 0;
//        while(true){
//            if(i==15){
//                break;
//            }
//            System.out.println(i);
//            i++;

        for(int j = 0;j<=15; j++){
            if(j%2 == 0){
                System.out.println("Чётное число " + j);
                continue;
            }
            System.out.println("Нечётное число " + j);
        }
    }
}
