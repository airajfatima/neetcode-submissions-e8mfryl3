class Solution {
    public int getSum(int a, int b) {
        int sum = 0, carry = 0;
        do{
            sum = a ^ b;
            carry = a & b;
            a = sum;
            b = carry << 1;
        }while(b != 0);
        return sum;
    }
}
