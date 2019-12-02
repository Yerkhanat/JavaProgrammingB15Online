package day11;

public class ScoreChecker {
    public static void main(String[] args) {
        int score = 40;
        // score is less than 0 or more than 100 --> invalid score
        // if the score is 100 ---> perfect score
        //if the score is between 70 - 100 --> you have passed
        if (score < 0 || score > 100) {
            System.out.println(" Invalid score");
        } else if (score == 100) {
            System.out.println("PERFECT SCORE!!");
        } else if (score > 70 && score < 100) {
            System.out.println("You have passed");
        }else
        if (score < 20) {
            System.out.println("Come to my office");
        }else
        if (score >= 30 && score <= 40) {
            System.out.println("Attend additional class");
        }else
        if (score >= 40 && score <= 70) {
            System.out.println("Little bit more study will let u pass");
        }else  {
            System.out.println("you have found the missing value score");
        }
    }
}
