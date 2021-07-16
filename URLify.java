import java.util.*;

public class URLify {
    /* write a method that replaces all spaces with '%20' NOTE: You can assume you 
    are given the "true" length of the string. */
    //FROM CTCI
    //start by thinking about string size, adding spaces, then
    //working backward thru the string
    void replaceSpaces(char[] str, int trueLength){
        int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        //if excess spaces add a null char, indicating spaces after have not been replaced
        //with a %20
        if( newIndex + 1 < str.length ) str[newIndex + 1] = '\0';
        //loop thru string backward
        for ( int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex-- ){
            //replace spaces with %20
            if ( str[oldIndex] == ' '){
                str[newIndex] = 0;
                str[newIndex - 1] = 2;
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else { //if no space, copy the character to new string
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
        }
    }
    //count occurance of character
    int countOfChar(char[] str, int start, int end, int target){
        int count = 0;
        for ( int i = start; i < end; i++ ){
            if (str[i] == target ){
                count++;
            }
        }
        return count;
    }


    //MY TRY
    // public static String transform( String stringToChange ){
    //     //make string into array
    //     char[] arrayToChange = stringToChange.toCharArray();
    //     //new String variable to return
    //     ArrayList<String> newString = new ArrayList<String>();
    //     //loop thru string
    //     for ( int i = 0; i < arrayToChange.length; i++ ){
    //         //find all spaces
    //         System.out.println(arrayToChange[i]);
    //         if (arrayToChange[i] != " "){
                
    //         }

    //         }
    //         //remove space if foun
//         }
// d
        //return array

}
