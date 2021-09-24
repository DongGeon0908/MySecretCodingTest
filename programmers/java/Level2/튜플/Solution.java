import java.util.*;


class Solution {
    public int[] solution(String s) {
        
        String[] temp = s
            .substring(2, s.length()-2)
            .split("\\},\\{");
		
		Arrays.sort(temp, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.length() - s2.length();
		    }
		});

		
		Set<Integer> data = new HashSet<>();
		int[] result = new int[temp.length];
		for(int i=0; i < temp.length; i++) {
			String[] cnp = temp[i].split(",");
			for(int j=0; j < cnp.length; j++) {
				int ttemp = Integer.parseInt(cnp[j]);
				if(!data.contains(ttemp)) {
					data.add(ttemp);
					result[i] = ttemp;
				}
			}
			
			
		}
        return result;
    }
}
