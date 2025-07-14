import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your max. marks here: ");
        int maxScore = sc.nextInt();

        System.out.println("Type your scored marks here: ");
        int userScore = sc.nextInt();
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.print("total percentage are: "+ percentage+"%" );
    }
}
