import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int sum = 0;

        // Do N operations
        for (int i = 0; i < N; i++) {
            int choice1 = sum - B[i];
            int choice2 = Integer.MIN_VALUE;
            int choice3 = Integer.MIN_VALUE;

            if (X > 0 && Y > 0) {
                int newX = X - 1;
                int newY = Y - 1;
                choice2 = sum + A[i] * newX * newY * Z;
            }

            if (Y > 0 && Z > 0) {
                int newY = Y - 1;
                int newZ = Z - 1;
                choice3 = sum + A[i] * X * newY * newZ;
            }

            // Choose the best option
            if (choice2 >= choice1 && choice2 >= choice3) {
                X--;
                Y--;
                sum = choice2;
            } else if (choice3 >= choice1) {
                Y--;
                Z--;
                sum = choice3;
            } else {
                sum = choice1;
            }
        }

        System.out.println(sum);
    }
}
