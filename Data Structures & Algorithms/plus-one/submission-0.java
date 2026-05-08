class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] + carry == 10){
                res.add(0, 0);
                carry = 1;
            }else{
                res.add(0, digits[i] + carry);
                carry = 0;
            }
        }
        if(carry != 0) res.add(0, carry);
        int[] result = new int[res.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
