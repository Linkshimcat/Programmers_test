class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hop = 0;
        int plus = 1;
        for (int s : num_list) {
            hop += s;
            plus *= s;
            if (plus < hop*hop) {
                answer = 1;
            }
            else {
                answer = 0;
            }
        }
        return answer;
    }
}