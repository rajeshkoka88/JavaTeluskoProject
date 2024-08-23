class Student
{
    String name;
    int age;
    int id;
    void studying()
    {
        System.out.println("Student is studying");
    }
    void playing()
    {
        System.out.println("Student is playing");
    }

}

    public class oopsc1p1 {
    public static void main (String [] args)
    {
        Student st = new Student(); // Object creation or Instantiation
        st.studying();
        st.playing();
    }
    // eg: creation of object eg class Fan {Fan f = new Fan(); }
}
