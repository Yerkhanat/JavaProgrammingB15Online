package day59;

public class General {
    public static void main(String[] args) {
//        Object o = new String("abc");
//
//        String str = "";
//        try {
//            System.out.println("here is the answer "+str.charAt(0));
//        }catch(NullPointerException e){
//
//            System.out.println("No object has been found");
//        }catch(Exception e){
//            System.out.println("rest of the exceptions are here");
//            System.out.println(e.getMessage());
//
//        }

        int [] nums = {1,4,6};
        try {
            System.out.println(nums[0]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Exception caught \n"+e.getMessage());
        }finally {
            System.out.println("This code will always run no matter we have exception or not");
        }


    }
    }
