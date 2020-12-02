class Super{
    //public Super(){}
    public Super(int i){
        System.out.println(100);
    }
}
class Sub extends Super{
    public Sub(){
        super(10);
        System.out.println(200);
    }
}

public class T3Q4 {
    public static void main(String[] args) {
        new Sub();
    }
}
