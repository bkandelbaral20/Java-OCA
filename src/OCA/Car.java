package OCA;

public class Car {
    private  String color;
   private  String type;

   static String start(){
       return ("Get started!");
   }

   void printDescription(){
       System.out.println("This is a " + color + " " + type);
   }

    public static void main(String[] args) {
        System.out.println(start());

    }
}
