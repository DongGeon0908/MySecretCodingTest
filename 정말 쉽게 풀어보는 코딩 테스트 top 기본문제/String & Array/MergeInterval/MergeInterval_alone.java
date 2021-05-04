import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval {
	int start;
	int end;

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}

public class MergeInterval_alone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval in1 = new Interval(1, 3);
		Interval in2 = new Interval(2, 6);
		Interval in3 = new Interval(8, 10);
		Interval in4 = new Interval(15, 18);

		List<Interval> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		MergeInterval_answer a = new MergeInterval_answer();
		List<Interval> list = a.merge(intervals);
		a.print(list);
	}

	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.isEmpty())
			return intervals;

		// type1 오름차순 정렬
		Collections.sort(intervals, (a, b) -> a.start - b.start);

		// 1. 담을 그릇
		List<Interval> result = new ArrayList<Interval>();

		// 2. 겹치는 두개를 하나로 만드는 작업
		Interval before = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (before.end >= current.start) {
				before.end = Math.max(current.end, before.end);
			} else {
				result.add(before);
				before = current;
			}
		}

		if (!result.contains(before)) {
			System.out.println("before.end: " + before.end);
			result.add(before);
		}

		return result;
	}

	void print(List<Interval> list) {
		for (int i = 0; i < list.size(); i++) {
			Interval in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}
	}
}
