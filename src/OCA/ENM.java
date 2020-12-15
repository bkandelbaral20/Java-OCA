package OCA;

/*
we cannot use string so we are using Enumeration(ENM)
creating Days object and calling each enum from Enm.java class file
 */

public class ENM {
    public static void main(String[] args) {

        Days today = Days.FRIDAY;

//         we can convert days enm to string
        String theDay = Days.FRIDAY.name();

//        Checking the days typed by user
        Days userDay = Days.valueOf("MONDAY");
        String response = "";

        switch (userDay) {
            case MONDAY:
                response = "Get to work!";
                break;
            case FRIDAY:
                response = "Time to relax";
                break;
            default:
                response = "Practice Java! ";

        }
        System.out.println(response);
    }
}
