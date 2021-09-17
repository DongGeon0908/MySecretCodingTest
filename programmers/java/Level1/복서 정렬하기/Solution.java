import java.util.*;


class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] countThanWeight = new int[head2head.length];
        int[] countWin = new int[head2head.length];

        int[] num = new int[head2head.length];
        for (int i = 0; i < head2head.length; i++) {
            for (int j = 0; j < head2head.length; j++) {
                if (head2head[i].charAt(j) == 'W' && i != j) {
                    if (weights[i] < weights[j]) {
                        countThanWeight[i]++;
                    }
                    countWin[i]++;
                    num[i]++;
                }
                if (head2head[i].charAt(j) == 'L') {
                    num[i]++;
                }
            }
        }

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < head2head.length; i++) {
            Member member = new Member((i + 1), (double) countWin[i] / num[i] * 100, countThanWeight[i], weights[i]);
            members.add(member);
        }

        Collections.sort(members);

        int[] result = new int[head2head.length];
        int k = 0;
        for (Member member : members) {
            result[k++] = member.id;
        }
        
        return result;
    }
}

class Member implements Comparable<Member> {
    int id;
    double win;
    int count;
    int weight;

    public Member(int id, double win, int count, int weight) {
        this.id = id;
        this.win = win;
        this.count = count;
        this.weight = weight;
    }

    @Override
    public int compareTo(Member o) {
        if (this.win > o.win) {
            return -1;
        } else if (this.win == o.win) {
            if (this.count > o.count) {
                return -1;
            } else if (this.count == o.count) {
                if (this.weight > o.weight) {
                    return -1;
                } else if (this.weight == o.weight) {
                    if (this.id < o.id) {
                        return -1;
                    }
                }
            }
        } else if (this.win < o.win) {
            return 1;
        } else {
            if (this.weight > o.weight) {
                return -1;
            } else if (this.weight == o.weight) {
                if (this.id < o.id) {
                    return -1;
                }
            }
        }
        return 1;
    }
}
