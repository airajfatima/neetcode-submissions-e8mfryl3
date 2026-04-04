class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char p : s.toCharArray()){
            if (p == '(' || p == '{' || p == '[')
                st.push(p);
            else if(!st.isEmpty()){
                char c = st.peek();
                if((c == '(' && p == ')') || (c == '{' && p == '}') || (c == '[' && p == ']'))
                    st.pop();
                else return false;
            }
            else return false;
        }
        return st.isEmpty();
    }
}
