class calculator
{
    int num1, num2, res;

//    void add(){
//        num1 = 10;
//        num2 = 20;
//        res = num1+num2;
//        System.out.println("Result is : " + res);
//    }

//    void add(int n1, int n2)
//    {
//        num1 = n1;
//        num2 = n2;
//        res = n1 + n2;
//        System.out.println("Result is : " + res);
//    }

//    int add()
//    {
//        num1 = 4;
//        num2 = 10;
//        res = num1 + num2;
//        return res;
//    }

    int add(int n1, int n2)
    {
        res = n1+n2;
        return res;
    }

}

public class Method1 {
    public static void main (String[] args)
    {
        calculator calc =  new calculator();
        //calc.add();
        //calc.add(12,4);
//      int result = calc.add();
//      System.out.println("Result is " + result);
        int result = calc.add(10,20);;
        System.out.println("Result is " + result);
    }
}
