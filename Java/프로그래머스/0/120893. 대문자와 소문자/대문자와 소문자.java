class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ax = my_string.charAt(i);
            if (Character.isLowerCase(ax)) {
                answer += Character.toUpperCase(ax);
            }
            else {
                answer += Character.toLowerCase(ax);
            }
        }
        return answer;
    }
}