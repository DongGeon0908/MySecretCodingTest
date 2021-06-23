import java.util.*;

class Solution_4 {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).map(string -> new IndexString(string, n)).sorted()
            .map(indexString -> indexString.string).toArray(String[]::new);
    }

    class IndexString implements Comparable<IndexString> {

        String string;
        char index;

        IndexString(String string, int index) {
            this.string = string;
            this.index = string.charAt(index);
        }

        public int compareTo(IndexString indexString) {
            System.out.println(index+"," + indexString.index);
            if (index == indexString.index) {
                return string.compareTo(indexString.string);
            } else {
                return index - indexString.index;
            }
        }
    }
}