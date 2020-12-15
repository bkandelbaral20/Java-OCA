package OCA;

public class Order {

//    adding static and instance variable
    static double price;
    double tips;

//    adding several static methods
    static double totalPrice(double price, double tips){
        return price+tips;
    }

    static double tips(double tips){
        return tips;
    }

    double withoutTip(double price) {
        return price;
    }

    public static void main(String[] args) {

//    add an instance method to use the static data in order
        Order o = new Order();
        System.out.println(totalPrice(20,2));
        System.out.println(tips(10));
        System.out.println(o.withoutTip(23));
    }
}
