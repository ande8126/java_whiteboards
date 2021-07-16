import java.util.*;

public class Palindrome {
    //given a string, write a function to check if it s a permuation of a palindrome
    //not limited to dictionary words
    //ignore casing
    boolean canBePalindrome( String string1 ){
        //what makes a palindrome?
        //need an even number of even characters
        //only one char can be odd
        //implement hash table
        int[] table = buildCharFrequencyTable(string1);
        return checkMaxOneOdd(table);
        //iterate thru hash table to make sure no more than one char has odd count

    }
    //only one char can be odd
    boolean checkMaxOneOdd( int[] table ){
        boolean foundOdd = false;
        for ( int count : table ){
            if ( count%2 == 1 ){
                if(foundOdd) {
                    return false;
                }
            foundOdd = true;
            }
        }
        return true;
    }

    //map each char to a number (a = 0), non-letters mapped to -1
    int getCharNumber( Character c ){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if ( a <= val && val <=z ){
            return val - a;
        }
        return -1;
    }
    //count how much a char appears
    int[] buildCharFrequencyTable(String string1){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for ( char c : string1.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1 ){
                table[x]++;
            }
        }
        return table;
    }
}
