class Employee{
    private int id;
    private String name;

   // Setter
   void setId(int i){
        id = i;
    }
    // Setter
    void setName(String n){
       name = n;
    }

    //Getter
    int getId(){
       return id;
    }
    //Getter
    String getName(){
       return name;
    }
}
public class Encapsulation2 {
    public static void main(String [] args){
        Employee emp = new Employee();
        emp.setId(230);
        emp.setName("rajesh");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
