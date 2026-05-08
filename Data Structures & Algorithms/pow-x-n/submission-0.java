class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        for(int i = 0; i < Math.abs(n); i++){
            res *= x;
        }
        if(n < 0) return 1 / res;
        else return res;
    }
}
