package OCA;

/*
we cannot use string so we are using Enumeration(ENM)
creatings Days object and calling each enum from Enm.java class file
 */
public class ENM {
    public static void main(String[] args) {

         Days today =  Days.FRIDAY;
         String response = "";

         switch(today){
             case MONDAY:
                 response ="Get to work!";
                 break;
             case FRIDAY:
                 response ="Time to relax";
                 break;
             default:
                 response = "Practice Java! ";

         }
        System.out.println(response);
    }
}
