class Mul{
//    int mul(int x, int y){
//        return x + y;
//    }
//    void mul(int a, int b){
//        int res =  a * b;
//    }
    double mul(int x, int y, double z){
        System.out.println("2 int and 1 double");
        return x * y * z;
    }
    double mul(double x, double y, double z){
        System.out.println("3 doubles");
        return x * y * z;
    }
    double mul(int x, double y){
        return x * y;
    }
    double mul(double x, int y){
        return x * y;
    }
}
public class MethodOverloading2 {
    public static void main(String[] args){
        Mul m = new Mul();
        // System.out.println(m.mul(4,10)); Ambiguity is there because 2 methods has same parameters type.
        System.out.println(m.mul(4,8, 12));
        System.out.println(m.mul(44,44, 44));
    }
}
