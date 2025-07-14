import java.util.Scanner;
/* 
asking user to input the marks that he scored and with that i 
calculate his percentage behalf of the max marks given.
    */
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
