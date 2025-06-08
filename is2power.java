// User function Template for Java

class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        int power=1;
        while(n>power){
            power*=2;
        }
        if(power==n){
            return true;
        }
        return false;
    }
   
}
