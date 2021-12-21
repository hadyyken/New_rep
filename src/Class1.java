public class Class1 {
    public static void main(String[] args) {
        int value = 0;
        while (value<5){
            System.out.println("Hi "+value);
            value++;
        }
        String str = "Javatpoint";
        int a = 0;
        while (str.length()>a){
            System.out.println(str.length() + "+" + a);
            a++;
        }
        for(int i = 0; i <=10; i++){
            System.out.println("Hello "+i);
        }
        for (int i = 1, j=1;j<=55;j++,i=i+2 ){
            System.out.println(i+"+j:"+j);
        }
        for(int i = 2, j=1;j<=20;i=i*2, j++){
            System.out.println(i+"j: "+j);
        }
    }
}


