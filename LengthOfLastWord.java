package String;
public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  "; // Example string
        int length = lengthOfLastWord(str);
        System.out.println("Length of the last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        // Step 1: Trim trailing spaces
        s = s.trim();

        // Step 2: Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Step 3: Calculate the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}
