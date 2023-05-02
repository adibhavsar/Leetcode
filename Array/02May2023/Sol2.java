//my solution

class Solution {

    public long minValue(long a[], long b[], long n) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        long product = 0L;
        for (int i = 0; i < a.length; i++) {
            product += a[i] * b[a.length - i - 1];
        }
        return product;
    }
}