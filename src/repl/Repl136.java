package repl;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Repl136 {
    public static void main(String[] args) {


        int[] nums = {1, 5, 4, 1, 5};
        String answer = "";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && nums[i] == nums[i + 1]) {
                answer = "true";
                break;
            } else {

                answer = "false";
            }


        }


    }
}
