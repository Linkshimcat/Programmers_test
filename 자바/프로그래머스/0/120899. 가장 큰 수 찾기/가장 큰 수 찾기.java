class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int maxnow = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxnow = i;
                System.out.println(max);
                System.out.println(maxnow);
            }
        }
        int[] answer = {max, maxnow};
        return answer;
    }
}