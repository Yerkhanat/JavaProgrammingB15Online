package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        int n =0;
        for (int i = 1; i < 100; i++) {
            if (i%15==0){
                n+=1;
            }

        }
        System.out.println(n);
    }
}
