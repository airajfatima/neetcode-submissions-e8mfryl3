class Solution {
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length ; i++){
            String s = tokens[i];
            if(isInteger(s)) stack.push(Integer.parseInt(s));
            else{
                int op2 = stack.pop();
                int op1 = stack.pop();
                if(s.equals("+")) stack.push(op1 + op2);
                else if(s.equals("-")) stack.push(op1 - op2);
                else if(s.equals("*")) stack.push(op1 * op2);
                else if(s.equals("/")) stack.push(op1 / op2);
            }
        }
        return stack.pop();         
    }
}

