package day44;

public class PersonAction {
    public static void main(String[] args) {
        Person p1  = new Person("Yerkhanat", 28);
        Person p2 = new Person("Janar",24);
        Person p3 = new Person("Rayim", 1);

        p1.species = "human";
        p2.species = "humanoid";
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println(p3);




    }
}
