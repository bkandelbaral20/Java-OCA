import java.util.ArrayList;
import java.util.List;

public class T3Q19 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("santosh")){
            fruits.remove("banana");
        }

        System.out.println(fruits);

    }
}
