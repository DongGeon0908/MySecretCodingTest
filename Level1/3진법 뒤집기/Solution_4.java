import java.util.ArrayList;
class Solution_4 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();
        //3진법으로 만들기
        int mok = n;
        while(true) {
            int mod = mok% 3;
            mok = mok/3;
            al.add(mod);
            System.out.println("몫" +mok + "나머지"+mod);
            if(mok ==0)
                break;
        }
        // 뒤집어서 10진법으로 만들기
        for(int i = 0; i<al.size(); i++ ) {
            answer += (int)(al.get(al.size()-1-i) * Math.pow(3, i));
        }
        return answer;
    }
}