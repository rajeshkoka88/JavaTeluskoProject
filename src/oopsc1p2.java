class Addition
{
    int num1; // num1 and num2 are instance variables can use these variables anywhere in this class
    int num2;
    int O;

    void add()
    {
        num1 = 10;
        num2 = 20;
        int res = num1 + num2; // res is a local variable, can only be used within this method only.
        System.out.println(res);
    }

    void sub()
    {
        int n;
        int res = num1 - num2;
        System.out.println(res);
       // System.out.println(n);// n is not initialised as it a local variable that is why we are getting an error here
        System.out.println(O);
    }

}
public class oopsc1p2 {
    public static void main (String [] args)
    {
        Addition c = new Addition();
        c.add(); // c is also local variable

        for(int i = 0; i < 4; i++)
        {
            System.out.println(i); // 'i' is local variable
        }
    }
}
