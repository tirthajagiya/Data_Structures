// import java.util.Arrays;

public class Try2 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] arr = { 1, 2, 3, 4 };
        s1.plusOne(arr);
    }
}

class Solution {
    public void plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += String.valueOf(digits[i]);
        }
        
        

        if(str.charAt(str.length()-1)==9){
            
        }

    }
}