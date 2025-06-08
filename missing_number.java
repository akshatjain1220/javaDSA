class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;int n=nums.length+1;
        int total_sum=n*(n-1)/2;
        for(int i=0;i<n-1;i+=1){
            sum=sum+nums[i];
        }
        return total_sum-sum;
    }
}
