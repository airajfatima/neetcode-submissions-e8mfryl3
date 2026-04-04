class MinStack {
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push((long)val);
            min = val;
        }
        else{
            if(val > min){
                stack.push((long)val);
            }else{
                stack.push(2L * val - min);  // FIX: use long
                min = val;
            }
        }
    }
    
    public void pop() {
        if(stack.peek() < min){
            min = 2 * min - stack.peek();
        }
        stack.pop();
    }
    
    public int top() {
        if(stack.peek() < min) return (int)min;
        else return stack.peek().intValue();
    }
    
    public int getMin() {
        return (int)min;
    }
}
