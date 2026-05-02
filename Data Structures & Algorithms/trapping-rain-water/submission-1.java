class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lMax = height[0], rMax = height[n - 1], total = 0;
        int l = 0, r = n - 1;
        while(l < r){
            if(lMax <= rMax){
                l++;
                total += Math.max((lMax - height[l]), 0);
                lMax = Math.max(lMax, height[l]);
            }else{
                r--;
                total += Math.max((rMax - height[r]), 0);
                rMax = Math.max(rMax, height[r]);
            }
        }
        return total;
    }
}
