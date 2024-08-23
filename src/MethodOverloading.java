class AdditionCalc{
    // Here one add method is overloaded with multiple tasks.
    // Creating multiple methods within same class with same name but with different parameters is known as method overloading.
    // This is also called as false polymorphism or compile time. Polymorphism means many forms 1 that is 1: many.
    int add(int n1, int n2){
        return n1 + n2;
    }
    int add (int n1, int n2, int n3){
        return n1+n2+n3;
    }
    double add(int n1, double n2){
        return n1 + n2;
    }
    double add(int n1,double n2, double n3 ){
        return n1+ n2+n3;
    }
    double add(double n1,double n2){
        return n1+ n2;
    }
    double add(double n1,double n2, double n3 ){
        return n1+ n2+n3;
    }
        }

public class MethodOverloading {

    public static void main (String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        double a = 10.5;
        double b = 12.5;
        double c = 14.5;

        AdditionCalc calc = new AdditionCalc();
//        int res = calc.add(x,y);
//        System.out.println(res);
        System.out.println(calc.add(x,y));
        System.out.println(calc.add(a,b));
        System.out.println(calc.add(x,y,z));
        System.out.println(calc.add(a,b,c));



    }

}
