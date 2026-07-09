class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numbers = String.valueOf(num);
        String numbers2 = String.valueOf(k);
        // System.out.println(numbers.indexOf(numbers2));
        int result = numbers.indexOf(numbers2) + 1;
        if (result == 0) {
            answer = -1;
        }
        else {
            answer = result;
        }
        return answer;
    }
}