class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        String minus = "-";
        String result = "";
        if (minus.equals("-")) {
            result += minus+answer;
        }
        return answer;
    }
}