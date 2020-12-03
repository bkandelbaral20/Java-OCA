public class T3Q11 {
    static boolean[] arr = new boolean[1];

    public static void main(String[] args) {

        //Boolean[] arr = new Boolean[1];

        if(arr[0]){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    final String  sayHello(){
        return "Hello";
    }

//    final keyword will not affect on overload but will affect on override it.

    class test extends T3Q11{
//        final String sayHello(){
//            return "Hello test";
//        }
    }
}
