package day19;

public class CharAndForLoop {
    public static void main(String[] args) {
        // each character had it's corresponding ascci value
        // from ascii table
        System.out.println(" ----------English alphabet letters--------");
//        char myChar = 65;
//        for (int i = 0; i <26 ; i++) {
//            System.out.print(i+1+ " ");
//            System.out.print( myChar+ " ");
//            ++myChar;
//
//        } // create interactive programm to ask you there startin character
         // then print everything between

        for (char ichar ='A'; ichar<'Z'; ichar++){
            System.out.print(ichar+ " ");
        }
    }
}
