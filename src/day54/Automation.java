package day54;

public class Automation {
    public static void main(String[] args) {
        ChromeDriver c1 = new ChromeDriver();
        WebDriver w1 = new ChromeDriver();
        w1.navigateTo("www.CybertekSchool.com");
        c1.navigateTo("www.apple.com");
        c1.closeBrowser();
    }
}
