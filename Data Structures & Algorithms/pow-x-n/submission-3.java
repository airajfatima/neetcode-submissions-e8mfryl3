class Solution {
    HashMap<Integer, Double> hm = new HashMap<>();
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        else if(n == 1) return x;
        else if(n == -1) return 1 / x;
        if(n % 2 == 0){
            double res;
            if(hm.containsKey(n / 2)) res = hm.get(n / 2);
            else{
                res = myPow(x, n / 2);
                hm.put(n / 2, res);
            }
            return res * res; 
        }else{
            double res1, res2;
            if(hm.containsKey(n / 2)) res1 = hm.get(n / 2);
            else{
                res1 = myPow(x, n / 2);
                hm.put(n / 2, res1);
            }
            if(n < 0){
                if(hm.containsKey(n / 2 - 1)) res2 = hm.get(n / 2 - 1);
                else{
                    res2 = myPow(x, n / 2 - 1);
                    hm.put(n / 2 - 1, res2);
                }
                return res1 * res2;
            }
            else{
                if(hm.containsKey(n / 2 + 1)) res2 = hm.get(n / 2 + 1);
                else{
                    res2 = myPow(x, n / 2 + 1);
                    hm.put(n / 2 + 1, res2);
                }
                return res1 * res2;
            }
        }
    }
}
