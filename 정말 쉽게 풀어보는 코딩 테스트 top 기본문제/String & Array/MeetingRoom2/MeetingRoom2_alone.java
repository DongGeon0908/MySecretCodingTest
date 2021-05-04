import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/* MeetingRoom2
 * 1. Start 타임으로 소팅
 * 2. PriortyQueue MinHeap: endtime 회의의 끝 시간이 중요
 * 3-1. 앞.end > 뒷.start : 회의실 1개 필요
 * 3-2. 앞.end <= 뒷.start : 회의실 필요 없음
 * 
 * */

class Interval {
	int start, end;

	Interval() {
		this.start = 0;
		this.end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}

public class MeetingRoom2_alone {

	public static void main(String[] args) {
		MeetingRoom2_alone a = new MeetingRoom2_alone();
		Interval in1 = new Interval(5, 10);
		Interval in2 = new Interval(15, 20);
		Interval in3 = new Interval(0, 30);
		Interval[] intervals = { in1, in2, in3 };
		System.out.println(a.solve(intervals));
	}

	public int solve(Interval[] intervals) {

		// 1. Sorting : 오름차순 정렬
		Arrays.sort(intervals, (Interval a, Interval b) -> a.start - b.start);

		// 2. 우선순위 큐 생성 - 큐의 우선순위는 위의 Sorting과 같음
		Queue<Interval> pq = new PriorityQueue<>((Interval a, Interval b) -> a.end - b.end);
		pq.add(intervals[0]);

		// 3. 걸리는 시간 찾기
		for (int i = 1; i < intervals.length; i++) {
			System.out.println("pq.peek(): " + pq.peek().end + " intervals[i].start " + intervals[i].start);

			// end시간과 start시간이 겹치는 경우
			if (pq.peek().end <= intervals[i].start) {
				pq.poll();
			}
			pq.add(intervals[i]);
		}

		return pq.size();
	}

}