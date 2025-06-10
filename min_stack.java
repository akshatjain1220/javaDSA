class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minstack;
    public MinStack() {
       stack = new Stack<Integer>();
       minstack = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(stack.isEmpty() || minstack.peek()>=val ){
            minstack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
