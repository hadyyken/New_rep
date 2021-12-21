package Less36;

interface AbleToEat{
    public void eat();
}
public class Less36 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Delicious");
            }
        };
        ableToEat.eat();
    }
}
