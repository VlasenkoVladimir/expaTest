import java.util.Scanner;

public class Main {

    static int kilogramsOfCarrotsOnBase = 0;
    static int remainingAttempts = 10;

    private static final int[] lawns = {0, 0, 0, 0, 0};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number of carrots in " + (i + 1) + " lawn: ");
            lawns[i] = scanner.nextInt();
        }

        int head = 0;
        int tail = 3;

        if (lawns[4] >= 10) {
            kilogramsOfCarrotsOnBase = 50;
        } else {

            kilogramsOfCarrotsOnBase = lawns[4] * 5;
            remainingAttempts -= lawns[4];

            while (remainingAttempts > 0) {
                if (lawns[tail] > 0 & lawns[head] > 0 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 1;
                    lawns[tail] -= 1;
                    kilogramsOfCarrotsOnBase += 5;
                    remainingAttempts--;
                } else if (lawns[tail - 1] > 0 & lawns[head + 1] > 0 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head + 1] -= 1;
                    lawns[tail - 1] -= 1;
                    kilogramsOfCarrotsOnBase += 5;
                    remainingAttempts--;
                } else if (lawns[tail - 1] > 0 & lawns[head] > 1 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 2;
                    lawns[tail - 1] -= 1;
                    kilogramsOfCarrotsOnBase += 5;
                    remainingAttempts--;
                } else if (lawns[tail - 2] > 1 & lawns[head] > 0 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 1;
                    lawns[tail - 2] -= 2;
                    kilogramsOfCarrotsOnBase += 5;
                    remainingAttempts--;
                } else if (lawns[tail - 2] > 0 & lawns[head] > 2 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 3;
                    lawns[tail - 2] -= 1;
                    kilogramsOfCarrotsOnBase += 5;
                    remainingAttempts--;
                } else if (lawns[head] > 4 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 5;
                    kilogramsOfCarrotsOnBase += 5;
                    remainingAttempts--;
                } else if (lawns[tail] > 0 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[tail] -= 1;
                    kilogramsOfCarrotsOnBase += 4;
                    remainingAttempts--;
                } else if (lawns[tail - 1] > 0 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[tail - 1] -= 1;
                    kilogramsOfCarrotsOnBase += 3;
                    remainingAttempts--;
                } else if (lawns[tail - 2] > 1 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[tail - 2] -= 2;
                    kilogramsOfCarrotsOnBase += 4;
                    remainingAttempts--;
                } else if (lawns[tail - 2] > 0 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[tail - 2] -= 1;
                    kilogramsOfCarrotsOnBase += 2;
                    remainingAttempts--;
                } else if (lawns[head] > 3 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 4;
                    kilogramsOfCarrotsOnBase += 4;
                    remainingAttempts--;
                } else if (lawns[head] > 2 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 3;
                    kilogramsOfCarrotsOnBase += 3;
                    remainingAttempts--;
                } else if (lawns[head] > 1 & kilogramsOfCarrotsOnBase < 50) {
                    lawns[head] -= 2;
                    kilogramsOfCarrotsOnBase += 2;
                    remainingAttempts--;
                } else if (lawns[head] > 0) {
                    lawns[head] -= 1;
                    kilogramsOfCarrotsOnBase += 1;
                    remainingAttempts--;
                } else {
                    break;
                }
            }

            System.out.println(kilogramsOfCarrotsOnBase + " kilograms of carrots captured");
        }
    }
}