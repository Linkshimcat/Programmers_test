class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String Upper = alp.toUpperCase();
        if (my_string.contains(alp)) {
            answer = my_string.replace(alp, Upper);
        }
        else {
            answer += my_string;
        }
        return answer;
    }
}