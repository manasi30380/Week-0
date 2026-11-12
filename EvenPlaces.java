import java.util.Scanner;
class EvenPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (place % 2 == 0) {
                sum += digit;
            }
            n /= 10;
            place++;
        }
        System.out.println("Sum of even places = " + sum);
    }
}