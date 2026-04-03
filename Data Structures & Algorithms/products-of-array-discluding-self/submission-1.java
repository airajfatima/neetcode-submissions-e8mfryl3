class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sz = nums.length;
        int productLeft = nums[sz - 1];
        int[] productRight = new int[sz];
        productRight[0] = 1;
        for(int i = 1; i < sz; i++){
            productRight[i] =  productRight[i - 1] * nums[i - 1];
        }
        for(int i = sz - 2; i >= 0; i--){
            productRight[i] = productRight[i] * productLeft;
            productLeft *= nums[i];
        }
        return productRight;
    }
}  
