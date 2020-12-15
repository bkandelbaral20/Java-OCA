package OCA;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;

public class Builder {
    public static void main(String[] args) {

        String name = "Binjita ";
        StringBuilder build = new StringBuilder();
        build.append("Hello ");
        build.append(name);
        build.append(". Right now,time is : ");
        build.append(LocalDateTime.now());
        build.append(" .");
        System.out.println(build);

    }
}
