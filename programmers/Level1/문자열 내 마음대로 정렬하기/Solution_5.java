import java.util.*;

class Solution_5 {
  public String[] solution(String[] strings, int n) {
      List<String> list = Arrays.asList(strings);
      list.sort((a, b) -> {
          int result = (a.split(""))[n].compareTo((b.split(""))[n]);
          if(result == 0)
              return a.compareTo(b);
          return result;
      });
      return list.toArray(new String[0]);
  }
}