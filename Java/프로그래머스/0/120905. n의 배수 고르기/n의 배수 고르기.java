class Solution {
    public int[] solution(int n, int[] numlist) {
        int a=0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                a++;
            }
        }
        int k=0;
        int[] arry = new int[a];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arry[k] = numlist[i];
                k++;
            }
        }
        return arry;
    }
}