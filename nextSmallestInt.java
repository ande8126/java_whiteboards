import java.util.Arrays;

public class nextSmallestInt {
    public static int search( int A[] ){
        //set value to change
        int lowestInt = 0;
        //sort array lowest to highest
        Arrays.sort(A);
        //test for all negatives
        if ( A[A.length-1] < 0 ){
            lowestInt = 1;
        } 
        else {
            //if positives, loop thru array
            for ( int i=1; i<A.length; i++){
                //compare each integer to its previous
                int current = A[i];
                int prevNum = A[i-1];
                if( current - prevNum >= 2 ){
                    lowestInt = prevNum+1;
                }
                else{
                    //if sequential, give next highest
                    lowestInt = A[A.length-1]+1;
                }
            }
        }
        return lowestInt;
    }
    //Driver
        public static void main(String[] args){
        int A[] = { 1, 1, 6, 3, 4, 2 };
        int missing = search(A);
        System.out.println( "The smallest missing positive number is: " + missing );
        
    }
}