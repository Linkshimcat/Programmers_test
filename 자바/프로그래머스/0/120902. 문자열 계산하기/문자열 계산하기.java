class Solution {
    public int solution(String my_string) {
        String[] parts = my_string.split(" ");
        int answer = Integer.parseInt(parts[0]);
        
        for (int i = 1; i < parts.length; i += 2) {
            String oper = parts[i];
            int numberOper = Integer.parseInt(parts[i + 1]);
            
            if (oper.equals("+")) {
                answer += numberOper;
            } else if (oper.equals("-")) {
                answer -= numberOper;
            }
        }
        
        return answer;
    }
}