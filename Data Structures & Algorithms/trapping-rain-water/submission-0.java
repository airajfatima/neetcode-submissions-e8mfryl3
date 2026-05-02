class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = height[0];
        suffixMax[n - 1] = height[n - 1];
        for(int i = 1; i < n; i++){
            prefixMax[i] = Math.max(height[i], prefixMax[i - 1]);
            suffixMax[n - i - 1] = Math.max(height[n - i - 1], suffixMax[n - i]);
        }
        for(int i = 1; i < n - 1; i++){
            int min = Math.min(prefixMax[i - 1], suffixMax[i + 1]);
            if(height[i] < min){
                res += min - height[i];
            }
        }
        return res;
    }
}
