class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        // for (int i = 0; i < num_list.length; i++) {
        //     if (num_list[i] == n) {
        //         answer += 1;
        //     }
        //     else {
        //         answer += 0;
        //     }
        // }
        
        for (int s : num_list) {
            if (s == n) {
                answer++;
                break;
            }
        }
        return answer;
    }
}