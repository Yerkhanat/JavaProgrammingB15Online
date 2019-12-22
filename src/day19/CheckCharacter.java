package day19;

public class CheckCharacter {
    public static void main(String[] args) {

        String name = "xxxcatdogcat";
        String name1= name;
        int catCounter = 0;
        int dogCounter =0;
        for (int i = 0; i <name.length() ; i+=1) {

            if(name.contains("cat")||name.startsWith("cat")){
                catCounter++;
                name = name.substring(name.indexOf("cat")+3);
            }
        }
        for (int i = 0; i <name1.length() ; i++) {
            if(name1.contains("dog")||name1.startsWith("dog")){
                dogCounter++;
                name1 = name1.substring(name1.indexOf("dog")+3);
            }

        }

        //System.out.println("cat counts "+catCounter);
        //System.out.println("dog counts "+ dogCounter);
        if(catCounter==dogCounter){

            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }



}
