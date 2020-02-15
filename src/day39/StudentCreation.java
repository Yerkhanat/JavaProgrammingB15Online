package day39;

public class StudentCreation {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 18;
        s1.name = "Yerkhanat";
        s1.gender = 'M';
        Student s2 = new Student();
        s2.age = 18;
        s2.name ="Janar";
        s2.gender = 'F';
        s2.age = 17;
        System.out.println(s2.age+" | "+s2.name+ " | "+s2.gender);


    }
}