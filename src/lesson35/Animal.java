package lesson35;

public class Animal {
    public Animal(){

    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal am sleeping");
    }
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }
}
