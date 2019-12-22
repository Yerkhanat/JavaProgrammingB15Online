package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
        int x=5;

        do{
            System.out.println(x);
            --x;
        }while (x>0);
    }
}

// while loop check the condition first then enter the statement
// do while loop will take the action at least once then check the condition

