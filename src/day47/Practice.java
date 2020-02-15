package day47;

class WebDriver {

public void get(){

    System.out.println("Opens Browser");
}


}
class ChromeDriver extends WebDriver {

@Override
    public void get(){
    System.out.println("Open Chrome Browser");
}

}

class FirefoxDriver extends WebDriver{
    @Override
    public void get(){
        System.out.println("Open Firefox Browser");
    }




}




public class Practice {
    public static void main(String[] args) {
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get();
        FirefoxDriver driver2  =new FirefoxDriver();
        driver2.get();

    }
}
