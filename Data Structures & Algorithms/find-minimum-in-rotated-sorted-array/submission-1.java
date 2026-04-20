class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        while(l < h){
            int mid = (l + h)/2;
            if(nums[l] > nums[h] && nums[l] < nums[mid]){
                l = mid + 1;
            }
            else if(nums[l] > nums[h] && nums[l] > nums[mid]){
                h = mid;
            }
            else if(nums[l] > nums[h] && nums[mid] > nums[h]){
                l = mid + 1;
            }
            else break;
        }
        return nums[l];
    }
}
