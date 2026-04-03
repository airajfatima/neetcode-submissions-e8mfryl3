class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sz = nums.length;
        int[] productLeft = new int[sz];
        int[] productRight = new int[sz];
        productLeft[sz - 1] = nums[sz - 1];
        productRight[0] = nums[0];
        for(int i = 1; i < sz; i++){
            productLeft[sz - i - 1] = productLeft[sz - i] * nums[sz - i - 1];
            productRight[i] =  productRight[i - 1] * nums[i];
        }
        int[] res = new int[sz];
        res[0] = productLeft[1];
        res[sz - 1] = productRight[sz - 2];
        for(int i = 1; i < sz - 1; i++)
            res[i] = productRight[i - 1] * productLeft[i + 1];
        return res;
    }
}  
