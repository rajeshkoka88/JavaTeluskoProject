class Learner {
    private int id;
    private String name;
    private String city;

    // Setter
    public void setId(int id) {
        // Shadowing problem becoz how to diff b/w local and instance variable without using this keyword.
        // this keyword is used to set the currently running object and diff b/w instance and local variable.
        this.id= id;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Setter
    public void setCity(String city) {
        this.city = city;
    }
    //Getter
    public int getId() {
        return id;
    }
    //Getter
    public String getName() {
        return name;
    }
    //Getter
    public String getCity() {
        return city;
    }
}

public class Encapsulation3 {
    public static void  main (String[] args){
        Learner learner = new Learner();
        learner.setId(1);
        learner.setName("Sravani");
        learner.setCity("Texas");

        int id2 = learner.getId();
        System.out.println("Id is " + id2);

        System.out.println(learner.getCity());
        System.out.println(learner.getName());
        System.out.println("***************************");

        Learner learner2 = new Learner();
        learner2.setId(2);
        learner2.setName("Rajesh");
        learner2.setCity("Toronto");

        int id = learner2.getId();
        System.out.println(learner2.getId());
        System.out.println(learner2.getCity());
        System.out.println(learner2.getName());
    }
}
