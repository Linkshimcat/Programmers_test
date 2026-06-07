class Solution {
    public int solution(int order) {
        String orderstr = String.valueOf(order);
        int answer = 0;
        
        if(order == 3 || order == 6 || order == 9) {
            ++answer;
        }
        else {
            for(int i = 0; i < orderstr.length(); i++) {
                char ch = orderstr.charAt(i);
                if (ch == '3' || ch == '6' || ch == '9') {
                    answer++;
                }
                
            }
        }
        
        return answer;
    }
}