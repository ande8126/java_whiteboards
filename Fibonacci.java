public class Fibonacci {
    static void fibo ( int N ){
        int num1 = 0, num2 = 1;
        int counter = 0;
        //loop thru
        while ( counter < N ){
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
    public static void main(String[] args){
        int N = 5;
        fibo(N);
    }    
}