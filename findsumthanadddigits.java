class Solution {
    public int addDigits(int num) {
        int count=0;int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
            // count++;
            if(sum>9){
                sum=sum/10+sum%10;
                count+=1;
            }
        }
        return sum;
    }
    }
