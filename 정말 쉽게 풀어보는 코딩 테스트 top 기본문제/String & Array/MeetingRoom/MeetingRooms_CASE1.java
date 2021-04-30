import java.util.Arrays;
import java.util.Comparator;

/* 해당 문제는 미팅룸에 현재 입력 받은 강의 목차가 수행될 수 있는지 없는지 판단하는 문제이다.
 *  만약 모든 강의가 겹치지 않고 수행될 수 있다면 true를 반환하고, 불가능하면 false를 반환한다.
 * */

class Interval {
	int start;
	int end;

	Interval() {
		this.start = 0;
		this.end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}

}

public class MeetingRooms_CASE1 {
	public static void main(String[] args) {
		MeetingRooms_CASE1 a = new MeetingRooms_CASE1();

		Interval in1 = new Interval(15, 20);
		Interval in2 = new Interval(5, 10);
		Interval in3 = new Interval(0, 30);

		Interval[] intervals = { in1, in2, in3 };
		System.out.println(a.solve(intervals));

	}

	public boolean solve(Interval[] intervals) {
		// 1 - 현재 데이터와, 정렬 후 데이터

		// 해당 부분에서는 아직 정렬되지 않은 데이터가 출력됨
		if (intervals == null) {
			return false;
		}
		print(intervals);

		// 해당 부분 이후 부터는 정렬 이후의 데이터가 출력됨
		Arrays.sort(intervals, comp);
		System.out.println("--------정렬후---------");
		print(intervals);

		// 각 데이터를 비교해서 겹치는 시간이 있는지 파악!
		for (int i = 1; i < intervals.length; i++) {

			// 만약에 끝시간이 이후 회의시간보다 늦다면 회의는 배정될 수 없음!!
			if (intervals[i - 1].end > intervals[i].start) {
				return false;
			}
		}

		return true;
	}

	// Comparator 재정의
	Comparator<Interval> comp = new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start - o2.start;
		}
	};

	public void print(Interval[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);
		}
	}
}
