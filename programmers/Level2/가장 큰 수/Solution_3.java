import java.util.*;

class Solution_3 {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++)
            s[i] = String.valueOf(numbers[i]);

        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(a.charAt(0) == b.charAt(0)){
                    int aa = Integer.parseInt(a+b);
                    int bb = Integer.parseInt(b+a);
                    return bb - aa;
                }

                return b.charAt(0) - a.charAt(0);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++)
            sb.append(s[i]);

        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}