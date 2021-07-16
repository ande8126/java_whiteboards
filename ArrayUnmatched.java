public class ArrayUnmatched {
    /* 
    A non-empty array A consisting of N integers is given. 
    The array contains an odd number of elements, and each 
    element of the array can be paired with another element 
    that has the same value, except for one element that is 
    left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9

        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
        
    Write a function:
(class Solution { public int solution(int[] A); })
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
    */
    public static int findUnpairedNumber(int[] N) {
        //new variable to hold result
        int unpairedNumber = 0;
        
        //loop thru array
        for (int i = 0; i < N.length; i++) {
            //double check pair
            int checkpoint = 0;
            //hold current number to compare
            int cachedNumber = N[i];  
            //nested loop to compare            
            for (int n = 0; n < N.length; n++) {
                //increment checkpoint to check for pair
                if (cachedNumber == N[n]) {
                    checkpoint++; 
                } 
            }
            //new value for oddball element       
            if (checkpoint < 2) {
                unpairedNumber = cachedNumber;    
            }
        }    
        return unpairedNumber;
    }
    public static void main(String[] args) {
        int[] unpairedArr = {9, 3, 9, 3, 9, 7, 9};
        System.out.println("Find unpaired number " + findUnpairedNumber(unpairedArr));
    }
}
