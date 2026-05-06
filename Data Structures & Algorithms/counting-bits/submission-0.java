class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            int temp = 0;
            for(int j = 0; j < 32; j++){
                int mask = 1 << j;
                if((mask & i) != 0) temp++;
            }
            res[i] = temp;
        }
        return res;
    }
}
