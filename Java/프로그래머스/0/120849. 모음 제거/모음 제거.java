class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // String[] alpha = {"a", "e", "i", "o", "u"};
        // for (int i = 0; i < alpha.length; i++) {
        //     answer = my_string.replace(alpha[i], "");
        //     }
        return my_string.replaceAll("[aeiou]", "");
    }
}