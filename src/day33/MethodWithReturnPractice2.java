package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {
        // TODO 1: Call your method here to test
        System.out.println("Your entery is "+ convertNumberToDay(4));
        // TODO 2: Optionally, creat an int Array that has 5 numbers
        int [] days= new int[]{3,4,5,6,7};
        for (int i = 0; i <days.length ; i++) {
            System.out.println(convertNumberToDay(i));

        }
    }
    public static String convertNumberToDay(int x){
        String day = "";
        switch (x){
            case 1: day ="Monday";
                break;
            case 2: day ="Tuesday";
                break;
            case 3: day ="Wednesday";
                break;
            case 4: day ="Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day ="Saturday";
                break;
            case 7: day = "Sunday";
                break;
            default:day ="FUNDAY";
        }
        return day;

    }
}
