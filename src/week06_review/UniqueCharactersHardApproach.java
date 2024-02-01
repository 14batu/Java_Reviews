package week06_review;

public class UniqueCharactersHardApproach {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = ""; // bd


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //a
            int frequency = 0; //1
            for (int i = 0; i < str.length(); i++) { // i: index of str
                if(ch == str.charAt(i)){ // to check if ch is matching with the character of the string at index i
                    frequency++; // everytime when the character is matching with the string's character, then increase the frequency by one
                }
            }

            if(frequency == 1){ // if the frequency is equal to one, that means the character is unique
                unique += ch;
            }

        } // use a loop to find the frequency of one character, then repeat it for every single character


        System.out.println(unique);









    }

}

/*
Write a program that can return the unique characters from a string

        Example:
            str = "aabcccd"

        Output:
            "bd"
 */