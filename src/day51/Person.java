package day51;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person Person2) {
//        if (this.age > Person2.age) {
//            return 1;
//        } else if (this.age == Person2.age) {
//            return 0;
//        } else {
//            return -1;
//        }
//
    return  this.name.compareTo(Person2.name);


    }

    public String getOlderName(Person Person3) {
        if (this.age > Person3.age) {
            return Person3.name;
        }
        return this.name;
    }









    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
