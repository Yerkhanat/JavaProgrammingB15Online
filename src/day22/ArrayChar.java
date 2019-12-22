package day22;

public class ArrayChar {
    public static void main(String[] args) {
        String name ="yerkhanat";
        char name1[] = new char[name.length()];
        name1[0]='Y';
        name1[1]='e';
        name1[2]='r';
        name1[3]='k';
        name1[4]='h';
        name1[5]='a';
        name1[6]='n';
        name1[7]='a';
        name1[8]='t';
        System.out.println(name1);


        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name1[i] + " ");
        }
    }
}
