class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        double product = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                product *= x;
            }
            x *= x;
            exp /= 2;
        }
        return product;
    }
}