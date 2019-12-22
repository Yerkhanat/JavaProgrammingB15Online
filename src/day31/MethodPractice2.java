package day31;

public class MethodPractice2 {
    public static void count1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printOddNumber() {

        for (int j = 1; j <=100; j++) {
            if(j%2!=0){
                System.out.print(j+" ");
            }

        }
        System.out.println();
    }
    public static void spellName() {
        String name = "Yerkhanat";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i)+"-");

        }
        System.out.println();
    }
    public static void main(String[] args) {
       count1to10();
       printOddNumber();
       spellName();
        }
    }

