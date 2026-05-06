class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for(int i : nums) sum += i;
        int sum1 = (n * (n + 1))/2;
        return sum1 - sum;
    }
}
