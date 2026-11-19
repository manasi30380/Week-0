import java.util.Scanner;
class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 1; j < n; j++) {
            int temp = j;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (j == rev) {
                System.out.print(j + " ");
            }
        }
    }
}