class Solution {
  public double solution(int[] arr) {
      
      double num = 0;
      
      for(int i : arr){
          num += i;
      }
      return num / arr.length;
      
  }
}