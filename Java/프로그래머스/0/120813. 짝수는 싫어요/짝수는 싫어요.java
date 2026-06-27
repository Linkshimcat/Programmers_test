class Solution {
    public int[] solution(int n) {
//      짝수 제외 개수 증가.
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
             sum++;   
            }
        }
        
//      짝수를 제외한 개수를 answer배열 크기만큼 대입.
        int[] answer = new int[sum];
        
//         최종 배열 결과
        int index = 0;
        for (int x = 1; x <= n; x++) {
            if (x % 2 != 0) {
                answer[index] = x;
                index++;
            }
        }
        
        return answer;
    }
}