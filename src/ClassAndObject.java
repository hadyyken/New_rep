public class ClassAndObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Egor");
        p1.setAge(30);
        p1.speak();
        Person p2 = new Person();
        p2.setName("Aleks");
        p2.setAge(25);
        p2.speak();
    }
}
class Person{
    private String name;
    private int age;
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Поле не должно быть пустым");
        }else{
        this.name=name;}
    }
    public String getName(){
        return name;
    }
    public int setAge(int age){
        if(age<0){
            System.out.println("Введён некоректный возраст");
        }else {
        this.age = age;}
        return age;
    }
    public int getAge(){
        return age;
    }
    void speak() {
        System.out.println("Меня зовут " + getName() + " Мне " + getAge() + " лет");
    }
}