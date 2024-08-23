class Teacher {
    private int cost;
    private String name;
    private  String color;

    // constructor is nothing but same as the class name with no explicit return type.
    // if there is no constructor in a class, JVM creates a default constructor.
    public Teacher(int cost, String name, String color){
        this.cost = cost;
        this.name = name;
        this.color = color;
    }

    public Teacher(){
        System.out.println("Zero parameter");
        cost = 4545;
        name = "Raj";
        color = "Asian";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class Constructor {
    public static void main(String[] args){

        Teacher t1 = new Teacher(1, "Hyder", "brown");
        System.out.println(t1.getCost());
        System.out.println(t1.getName());
        System.out.println(t1.getColor());
        System.out.println("**********************");
        Teacher t2 = new Teacher();
        System.out.println(t2.getCost());
        System.out.println(t2.getName());
        System.out.println(t2.getColor());

    }
}
