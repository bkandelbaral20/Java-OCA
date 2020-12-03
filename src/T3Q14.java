import java.util.ArrayList;
import java.util.List;

public class T3Q14 {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("true"));
        list.add(new Boolean ("abc"));
        //System.out.println(list);

        if(list.remove(1)){
            list.remove(1);
        }

        System.out.println(list);
    }
}
