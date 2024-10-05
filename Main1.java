package Inheritance;

 import Inherit1.AudioBook;
// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
// Example 2:

// Input: s = "abc", indices = [0,1,2]
// Output: "abc"
// Explanation: After shuffling, each character remains in its position.
 

public class Main1 {
    public static void main(String[] args) {
// String command="codeleet";
// int[] indices= new int[] {4,5,6,7,0,2,1,3};
// Solution obj=new Solution();
// System.out.println(obj.interpret(command));
         AudioBook obj=new AudioBook("JAVA","JAMES",1.23,250.0,2.0);
          obj.displaybookdetails();
         System.out.println("hello".concat("dnfnf"));
    }
}
// class Solution {
//     public String restoreString(String s, int[] indices) {
//         char[] result=new char[indices.length];
//         for (Integer i:indices) {
//            result[indices[i]]=s.charAt(i);
//         }
//         return new String(result);

//     }
// }
// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".
// Example 2:

// Input: command = "G()()()()(al)"
// Output: "Gooooal"
// Example 3:

// Input: command = "(al)G(al)()()G"
// Output: "alGalooG"
// class Solution {
//     public String interpret(String command) {
//         for (int index = 0; index < command.length()-1; index++) {
//            if(command.charAt(index)=='(') {
//             if(command.charAt(index)==')') {

//            }
//         }        }
//     }
