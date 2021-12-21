public class MassSTR {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "Hello";
        s[1] = "Bye";
        s[2] = "world!";
        for(String x:s){
            System.out.println(x);
        }
        System.out.println();
        int[] m = {1,3,5,1,3,6};
        int sum = 0;
        for(int i:m){
            sum +=  i;

        }
        System.out.println(sum);
    }
}
