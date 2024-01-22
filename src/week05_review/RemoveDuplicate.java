package week05_review;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // each character of str

            if (result.contains(""+ch)){
                continue;
            }
            result += ch;
        }



    }
}
/*
Write a program that can remove the duplicated characters from a string

        Example:
            str = "aabbbcccc"

        Output:
            "abc"
 */
