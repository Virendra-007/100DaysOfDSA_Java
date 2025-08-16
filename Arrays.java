package apnaCollegeTutorial;
import java.util.Scanner;

/*
public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        //print the numbers in array
        for(int i=0; i< size; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
*/

//---------Home work------------
public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];


        //input
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }

    }
}
