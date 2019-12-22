package day26;

public class ArrayTask_numberTest {
    public static void main(String[] args) {
        int[] scores = {156,101,76,187,87,110};
        String finalResult ="";
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]<100) {
                System.out.println("Index " + i + " is less than 100");
                break;
            }

                else if(i==scores.length-1){
                    if (scores[i]>100) {
                        System.out.println("All indexes are higher than 100 ");
                    }
                }


            }

        }


    }

