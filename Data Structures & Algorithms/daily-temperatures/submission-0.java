class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{temperatures[0], 0});
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty()){
                int[] peek = stack.peek();
                if(peek[0] < temperatures[i]){
                    stack.pop();
                    res[peek[1]] = i - peek[1];
                }else break;
            }
            stack.push(new int[]{temperatures[i], i});
        }
        while(!stack.isEmpty()){
            int[] peek = stack.pop();
            res[peek[1]] = 0;
        }
        return res;
    }
}
