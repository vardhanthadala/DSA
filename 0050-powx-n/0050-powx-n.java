class Solution {
    // public double myPow(double x, int n) {//O(logn) O(1)
    //     return Math.pow(x,n);
    // }

    // public double myPow(double x, int n) {//brute force O(N) O(1) Not works for negative X
    // double ans=1;
    // for(int i=0;i<n;i++){
    //     ans=ans*x;
    // }
    // return ans;
    // }

    //Recursion  Time : O(logn)  space : O(logn)
    public double myPow(double x, int n){

    // Base condition: If n is 0, x^0 is 1
        if (n == 0) {
            return 1;
        }
        // Convert n to a long integer to handle the edge case with Integer.MIN_VALUE
        long N = n;
  // If n is negative, take the reciprocal of x and make N positive
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        // If N is even, recursively compute the square of x^(N/2)
        if (N % 2 == 0) {
            return myPow(x * x, (int) (N / 2));
        } 
         // If N is odd, recursively compute x^(N-1) and multiply it by x
        else {
            return x * myPow(x, (int) (N - 1));
        }
    }
}