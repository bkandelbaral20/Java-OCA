import java.time.LocalDate;

public class T3Q10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-06-25");
        int monthdate = date.getDayOfMonth();
        while(monthdate >= 20){
            System.out.println(date);

        }


    }
}
