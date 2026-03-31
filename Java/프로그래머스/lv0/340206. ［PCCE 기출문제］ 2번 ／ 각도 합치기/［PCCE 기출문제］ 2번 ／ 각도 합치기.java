import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle % 360); //여기 부분만 고치면 되는거 아닌가?
    }
}