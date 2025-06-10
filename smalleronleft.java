class Solution {
    public int[] leftSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
         int n=arr.length;
         int[] result = new int[n];
         for(int i=0;i<n;i+=1){
             while(!stack.isEmpty() && arr[i]<= stack.peek()){
                 stack.pop();
             }
             if(stack.isEmpty()){
                 result[i]=-1;
             }
             else{
                 result[i]=stack.peek();
                 stack.push(arr[i]);
             }
             return result;
         }
    }
}
