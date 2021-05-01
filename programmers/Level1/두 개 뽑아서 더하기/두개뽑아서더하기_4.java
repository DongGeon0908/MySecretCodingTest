import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                int tmp = numbers[i] + numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }
            }   
        }

        int size = 0;
        answer = new int[list.size()];
        for(int num : list){
            answer[size++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}
