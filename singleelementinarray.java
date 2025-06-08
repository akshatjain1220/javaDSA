class Solution {
    public int singleNumber(int[] nums) {
       int n=nums.length;
       for(int i=0;i<n;i+=1){
        int count=0;
        for(int j=0;j<n;j+=1){
            if(nums[i]==nums[j]){
                count+=1;
            }
        if(count==1){
            return nums[i];
        }
            // return -1;
        }
       } 
       return -1;
    }
}
