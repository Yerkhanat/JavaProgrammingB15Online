package day35;

public class CharacterPractice {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('A'));
        String str = "A34B123C4X";
        String numsInString = "";

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                //System.out.println(str.charAt(i));
                numsInString += str.charAt(i);

            }


        }//System.out.println(numsInString);
        int nums = Integer.valueOf(numsInString);
        System.out.println(nums);
        String [] allLetter = numsInString.split("");
        int num= 0;
        for (String each : allLetter
             ) {
            num += Integer.parseInt(each);

        }
        System.out.println("Total is ="+num);
    }
}
