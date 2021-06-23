class Solution_2 {
    public long nlcm(int[] num) {
        long a = 0;
        long b = 0;
        long value = num[0];

        for(int i = 1; i<num.length; i++) {
            a = Math.max(value, num[i]);
            b = Math.min(value, num[i]);
            value = a*b/gcd(a, b);
        }
        return value;
    }

    public static long gcd(long p, long q) {
        if(q==0) return p;
        return gcd(q, p%q);
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 2, 6, 8, 14 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}