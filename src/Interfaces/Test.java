package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Egor");
        animal.showInfo();
        person.showInfo();
    }
}
