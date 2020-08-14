public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0,i=1;
        while(n!=0){
           result|=(n&1)<<32-i++;
           n=n>>>1;  
        }
        return result;
    }
}