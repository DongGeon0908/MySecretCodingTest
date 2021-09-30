import java.util.*;
import java.util.stream.IntStream;

class Solution {
    static Map<String, ArrayList<Integer>> infos = new HashMap<>();

    public int[] solution(String[] info, String[] query) {

        int[] answer = new int[query.length];

        IntStream.range(0, info.length).forEach(i -> dfs("", 0, info[i].split(" ")));

        List<String> list = new ArrayList<>(infos.keySet());
        list.stream().map(s -> infos.get(s)).forEach(Collections::sort);

        IntStream.range(0, query.length).forEach(i -> {
            query[i] = query[i].replace(" and ", "");
            String[] str = query[i].split(" ");
            int score = Integer.parseInt(str[1]);
            answer[i] = search(str[0], score);
        });
        return answer;
    }


    private void dfs(String position, int depth, String[] info) {

        if (depth == 4) {
            if (!infos.containsKey(position)) {
                ArrayList<Integer> in = new ArrayList<>();
                in.add(Integer.parseInt(info[4]));
                infos.put(position, in);
            } else {
                infos.get(position).add(Integer.parseInt(info[4]));
            }
            return;
        }
        dfs(position + "-", depth + 1, info);
        dfs(position + info[depth], depth + 1, info);

    }

    private int search(String str, int score) {
        if (!infos.containsKey(str)) {
            return 0;
        }
        List<Integer> scores = infos.get(str);
        int start = 0;
        int end = scores.size() - 1;
        while (start <= end) {

            int mid = (start + end) / 2;
            if (scores.get(mid) < score) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return scores.size() - start;
    }
}
