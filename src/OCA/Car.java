package OCA;

import javax.swing.*;

public class Car {
    private  String color;
   private  String type;


    public static void main(String[] args) {

//   Instantiating object
        Car myCar = new Car();
        myCar.color ="black";
        myCar.type ="DeLorean DMC-12";

        System.out.println("My car is in " + myCar.color + " color and " + myCar.type + " type" );
    }
}
