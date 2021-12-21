public class Constrakt {
    public static void main(String[] args) {
        Human h = new Human("Xyz",23 );
        h.setAge(18);
        h.setName("Egor");
        h.speak();
    }
}
class Human{
    private String name;
    private int age;
    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void speak(){
        System.out.println(name +"," + age);
    }
}