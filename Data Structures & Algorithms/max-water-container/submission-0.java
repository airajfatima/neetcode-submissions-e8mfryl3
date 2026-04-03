class Solution {
    public int maxArea(int[] heights) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++){
            for(int j = i + 1; j < heights.length; j++){
                int h = Math.min(heights[i], heights[j]);
                res = Math.max(res, h * (j - i));
            }
        }
        return res;
    }
}
