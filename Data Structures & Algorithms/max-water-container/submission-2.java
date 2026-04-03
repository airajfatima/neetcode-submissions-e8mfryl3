class Solution {
    public int maxArea(int[] heights) {
        int res = Integer.MIN_VALUE;
        int i = 0, j = heights.length - 1;
        while(i < j){
            if(heights[i] < heights[j]){
                res = Math.max(heights[i] * (j - i), res);
                i++;
            }
            else{
                res = Math.max(heights[j] * (j - i), res);
                j--;
            }
        }
        return res;
    }
}
