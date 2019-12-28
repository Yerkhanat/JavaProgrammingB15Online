package repl;

public class Repl150 {
    public static void printHollowRect()
        {
            for(int i= 0; i<5; i++){
              // System.out.println("*");
                for (int j = 0;j<5; j++){
                    if(j==0||j==4||i==0||i==4){
                        System.out.print("*");
                    }
                    else if(j>0&&j<4){
                        System.out.print(" ");
                    }
                }
                System.out.println();


            }

        }

        public static void main(String[] args) {

            printHollowRect();
        }
}

