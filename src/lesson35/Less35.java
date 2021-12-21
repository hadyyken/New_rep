package lesson35;

import java.util.ArrayList;
import java.util.List;



public class Less35 {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        listOfAnimal.add(new Animal(3));

        List<Dog> lisOfDogs = new ArrayList<>();
        lisOfDogs.add(new Dog());
        lisOfDogs.add(new Dog());
        lisOfDogs.add(new Dog());

        Animal animal = new Animal();
        Animal animal2 = new Animal(){
            public void eat(){
                System.out.println("Other animal is eating");
            }
        };
        animal2.eat();
//        less35(lisOfDogs);
//        less35(listOfAnimal);
    }

//    private static void less35(List<? extends Animal> list){
//        for(Animal animal: list){
//            System.out.println(animal);
//        }
//    }
}
