class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int s : array) {
            if (s == n) {
                answer++;
            }
        }
        return answer;
    }
}