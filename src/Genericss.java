import java.util.ArrayList;
import java.util.List;

public class Genericss {
    public static void main(String[] args) {
        ///////// Before JAVA 5 ////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");
        String a = (String) animals.get(0);
        System.out.println(a);
        ///////// С появлением Generics /////////////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("Spider");
        animals1.add("Geakon");
        animals1.add("Fox");
        String a1 = animals1.get(1);
        System.out.println(a1);
        ///////// JAVA 7 //////////////
        List<String> a3 = new ArrayList<>();
    }
}
