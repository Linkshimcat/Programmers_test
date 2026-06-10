class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        //{0,0,0,0,0}
        
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}