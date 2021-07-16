import java.util.*;


public class Anagram {
    /* Two strings are said to be anagrams of one another 
    if you can turn the first string into
    the second by rearranging its letters. For example, “table” 
    and “bleat” are anagrams, as are “tear” and “rate.” Your job 
    is to write a function that takes in two strings as input and
    determines whether they're anagrams of one another.
 */
    public static boolean compare( String string1, String string2 ){
        //determine anagram
        //must be matching matching lengths
        if( string1.length() != string2.length() ){
            return false;
        }
        //must have matching letters
        //strings to character arrays
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string1.toCharArray();
        //sort
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        //print out what i have
        System.out.println("chars1: " + new String(chars1));
        System.out.println("chars2: " + new String(chars2));
        if( Arrays.equals(chars1, chars2) ){
            return true;
        } else {
            return false;
        }
    }
    //Driver
    public static void main ( String[] args ){
        String string1 = "bleat";
        String string2 = "table";
        System.out.print( compare(string1, string2) );
    }
}
