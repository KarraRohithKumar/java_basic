public class Add_Digits {
    public static void main(String[] args) {

        Solution obj = new Solution();
        System.out.println(obj.addDigits(2));
    }
}

class Solution {
    public int addDigits(int num) {
        if (num >= 0 && num <= 9) {
            return num;
        }
        while (num > 9) {

            int k = num % 10;
            int m = num / 10;
            num = k + m;
        }
        return num;
    }
}