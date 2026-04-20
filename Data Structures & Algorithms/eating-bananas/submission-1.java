class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxEle = Integer.MIN_VALUE;
        for(int p : piles){
            maxEle = Math.max(p, maxEle);
        }
        int low = 1, high = maxEle;
        int res = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low + high)/2;
            int hours = 0;
            for(int p : piles){
                hours += Math.ceil((double)p/mid);
            }
            if(hours <= h){
                res = Math.min(res, mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return res;
    }
}
