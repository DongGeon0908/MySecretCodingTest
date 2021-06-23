class Solution_2 {
    public long nlcm(int[] num) {
        long answer = num[0],g;
    for(int i=1;i<num.length;i++){
      g=gcd(answer,num[i]);
            answer=g*(answer/g)*(num[i]/g);
    }
        return answer;
    }
    public long gcd(long a,long b){
    if(a>b)
      return (a%b==0)? b:gcd(b,a%b);
    else 
      return (b%a==0)? a:gcd(a,b%a);
  }
    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 2, 6, 8, 14 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}