package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;


    public void displayInformation(){

        System.out.println("You will be start in \""+company +"\" which is located in "+location+ " and your salaray will be $"+salary+"\n"+

                "will you be full time? "+isFullTime);
    }

    public void turnFullTime(){
        if(isFullTime==false) {
            isFullTime = true;
        }
    } public void changeLocation(String newLocation){

        location = newLocation;
    }public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newFullTime){

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newFullTime;
        displayInformation();



    } public boolean isOne100k(){

        return salary>100000l;
    }  public String toString(){

        return "[location = "+location+", "+"Company = "+company+" | "+
                "Salary = "+salary+" | "+ "isFullTime = "+isFullTime+"]";
    }






}
