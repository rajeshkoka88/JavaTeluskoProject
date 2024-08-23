public class MethodOverloading3 {
    public static void main(String[] args){
        System.out.println("main method with string of args");
        main(44);
        main("Rajesh", 50);
    }
    public static void main(int args){
        System.out.println("main method with int of args");
    }
    public static void main(String name, int age){
        System.out.println("main method with int and string of args");
    }
    // Yes, we can overload main method in java but JVM will invoke main method with String[] args.
    // other main methods won't be invoked.
}
