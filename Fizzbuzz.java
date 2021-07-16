public class Fizzbuzz {
    /* The FizzBuzz problem is a classic test given in coding 
    interviews. The task is simple: Print integers 1 to 50,
    but print “Fizz” if an integer is divisible by 3, “Buzz” 
    if an integer is divisible by 5, and “FizzBuzz” if an 
    integer is divisible by both 3 and 5.*/
    static void Fizzy( int N ) {
        for ( int i=1; i<=N; i++ ){
            //loop thru ints
            //print FizzBuzz if divisible by both 3 and 5
            if( i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            }
            //print Fizz if divisible by 3
            else if( i % 3 == 0 ){
                System.out.println("Fizz");
            }
            //print Buzz if divisible by 5
            else if( i % 5 == 0 ){
                System.out.println("Buzz");
            }
            //print other ints
            else{
                System.out.println(i);
            }          
        }
    }
    public static void main( String[] args ){
        int N = 50;
        Fizzy(N);
    }
}


