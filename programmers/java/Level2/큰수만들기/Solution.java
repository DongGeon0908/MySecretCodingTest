class Solution {
    public long solution(long w, long h) {  
        return w * h - (w + h - gcd(w, h));
    }
    private long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }    
}
