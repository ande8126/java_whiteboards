public class BinaryGap {
    public static int binaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i)
            if (((N >> i) & 1) != 0)
                A[t++] = i;

        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
            ans = Math.max(ans, A[i+1] - A[i]);
        return ans;
    }
    //alternate solution
    public static int binaryGap2(int N) {
        String a=Integer.toBinaryString(N);//converting n into binary string
        int x=0;
        int u=0;
        int max=0;
        for (char ch:a.toCharArray()){
            if (ch=='1'){
                x++;
            }
            if(x==1&&ch=='0')
                u++;
            if(x==2){
                u++;
            if(u>max){
                max=u;
            }
            x=1;
            u=0;
            }
        }
        return max;
        }
    public static int binaryGap3( int N ) {
        //convert int to array of binary
        char[] binaryNumber = Integer.toBinaryString(N).toCharArray();
        //assign previous index value
        int previousIndex = 0;
        //loop thru to find the closest '1' and break
        for (int i = 0; i < binaryNumber.length; i++) {
            if (binaryNumber[i] == '1') {
                previousIndex = i;
                break;
            }
        } 
        boolean seen = false;
        //assign variable for largest gap
        int maxDifference = 0;
        //loop thru starting at the most recent 1
        for (int i = previousIndex+1; i < binaryNumber.length; i++) {
            //find the next closest '1'
            if (binaryNumber[i] == '1') {
                //find the greater of the two gaps
                maxDifference = Math.max(maxDifference, i-previousIndex);
                previousIndex = i; //new value for previous index
                seen = true;
            }
        }
    
        if (!seen) {
            return 0;
        }
    
        return maxDifference;
    }

    public static void main( String[] args ){
        int N = 6;
        System.out.println(binaryGap(N));
        System.out.println(binaryGap2(N));
        System.out.println(binaryGap3(N));
    }
}