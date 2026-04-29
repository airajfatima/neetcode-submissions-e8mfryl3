class Solution {
    public int findDuplicate(int[] nums) {
        int res = 0;
        for(int b = 0; b < 32; b++){
            int mask = 1 << b;
            int x = 0, y = 0;
            for(int num : nums){
                if((mask & num) > 0) x++;
            }
            for(int i = 1; i < nums.length; i++){
                if((i & mask) > 0) y++;
            }
            if(x > y) res |= mask;
        }
        return res;
    }
}
