class Solution {
  public long solution(long num) {
      double sqrt = Math.sqrt(num);
        return (long) ((sqrt % 1) == 0 ? (sqrt + 1) * (sqrt + 1) : -1);
  }
}