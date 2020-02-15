package day47;


class Credientals {
    private final String userName = "Cybertek";
    private final String password = "12321";
    



}

class Holly {
    final public void printName(){

        System.out.println("Yerqa");

    }

}



public class FinalKeyword extends Holly{
 //Overload
    public void printName(String x){
        System.out.println(x);
    }



    final int age =28;
    public static void main(String[] args) {
        final String SSN = "123456";
        final String dateOfBirth="06/28/1991";
        System.out.println(SSN);
        System.out.println(dateOfBirth);
        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.age);
        obj.printName("Yerqa");
 }


 
}
