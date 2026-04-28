class Solution {
    public int solution(int n) {
        int answer = 1;
        if (n%7 != 0) {
         return n/7+1;
        }
        else {
            return n/7;   
        }
    }
}