class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cofferV = 5500;
        answer[0] = money / cofferV;
        answer[1] = money % cofferV;
        return answer;
    }
}