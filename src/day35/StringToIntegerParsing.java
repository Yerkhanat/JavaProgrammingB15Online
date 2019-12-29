package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {
        String strNum = "100";
        int num = Integer.parseInt(strNum);
        String empId = "FB-457";
        int id = Integer.parseInt(empId.split("-")[1]);
        System.out.println(id);
        String nums = "100,600";
        int sum = Integer.parseInt(nums.split(",")[0])+Integer.parseInt(nums.split(",")[1]);
        System.out.println(sum);
    }
}
