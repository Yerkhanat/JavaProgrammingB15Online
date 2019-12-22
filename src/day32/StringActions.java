package day32;

public class StringActions {
    public static void main(String[] args) {
        reversePrintMyOwnName("Yerkhanat");
        reversePrintMyOwnName("Janar");
    }
    public static void reversePrintMyOwnName(String name){

        for (int i = name.length()-1; i >=0 ; i--) {

           if(i!=0) {
               System.out.print(name.charAt(i) + "-");
           }else {
               System.out.print(name.charAt(i));
           }

        }
        System.out.println();

    }


}


