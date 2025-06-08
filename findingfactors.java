class Solution {
    static int countFactors(int N) {
        int count=0;
        for(int i=1;i<=N;i+=1){
            if(N%i==0){
                count+=1;
            }
    }
    return count;
 }
}
