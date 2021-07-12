import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        Queue<Character> queue = new LinkedList<>();

        int result = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            queue.clear();

            for (int j = 0; j < skill.length(); j++) {
                queue.add(skill.charAt(j));
            }

            boolean check = true;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                char c = skill_trees[i].charAt(j);
                if (queue.size() == 0) {
                    break;
                }
                if (queue.contains(c) && queue.poll() != c) {
                    check = false;
                    break;
                }
            }

            if (check) {
                result++;
            }
        }
        return result;
    }
}