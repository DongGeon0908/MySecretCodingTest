class Solution {
    public long[] solution(long[] numbers) {
        long[] result = numbers.clone();

        for (int i = 0; i < result.length; i++) {
            result[i]++;
            result[i] += (result[i] ^ numbers[i]) >> 2;
        }
        return result;
    }
}

// XOR 연산으로 다른 지점을 구하고, 2개 비트를 밀어서 구함...
