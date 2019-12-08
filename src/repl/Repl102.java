package repl;

import java.util.Scanner;

public class Repl102 {
    public static void main(String[] args) {

                //Scanner scan = new Scanner(System.in);
               //String html = scan.nextLine();
                //String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"mynewid\"></p></body></html>";
                String html = "<!DOCTYPE html><html><head><title>Test</title></head><body><div><a href=\"http://www.google.com\" id=\"linkid\">Clicki Here!</a></div></body></html>";
                for(int i=0; i<html.length();i++){
                    if((html.substring(i).contains("<html>"))&&(html.substring(i).contains("</html>"))){
                        int sub1 = html.indexOf("id")+4;
                        int sub2 = html.indexOf(("</"),sub1);
                        html=html.substring(sub1,sub2);
                        System.out.println(html);
                        break;
                    }else if(!html.substring(i).contains("<html>")&&!(html.substring(i).contains("</html>"))){
                        System.out.println("Invalid output");
                    }
                }


    }
}
