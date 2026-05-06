class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            int mask = ((n >> i) & 1);
            res = (res << 1) | mask;
        }
        return res;
    }
}
