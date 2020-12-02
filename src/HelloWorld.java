public class HelloWorld {
    public static void main(String[] args) {
        m(1);
    }

    private static void m(Object i) {
        System.out.println("Object");
    }

    private static void m(Number i) {
        System.out.println("Number");
    }
    private static void m(Double i) {
        System.out.println("Double");
    }

}
