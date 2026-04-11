class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;// l = 0, r = 5
        while(left <= right){
            int mid = (right + left)/2;// 2 //1
            if(nums[mid] == target) // 2==4
                return mid;
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;// l = 3
            }
        }
        return -1;
    }
}
