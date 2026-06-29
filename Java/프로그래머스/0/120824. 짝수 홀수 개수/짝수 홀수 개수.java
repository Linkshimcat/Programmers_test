class Solution {
    public int[] solution(int[] num_list) {
        int clapp = 0;
        int unclapp = 0;
        for (int s : num_list) {
            if (s % 2 == 0) {
                clapp++;
            }
            else {
                unclapp++;
            }
        }
        
        int[] answer = {clapp, unclapp};
        
        return answer;
    }
}