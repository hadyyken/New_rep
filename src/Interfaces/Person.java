package Interfaces;

import com.sun.org.apache.xerces.internal.xni.QName;

public class Person implements Info {
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void SayHello(){
        System.out.println("HElLO");
    }

    public void showInfo() {
        System.out.println("name is "+this.name);
    }
}
