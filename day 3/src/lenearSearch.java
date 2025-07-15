import java.util.Scanner;

class lenearSearch {
    public static int linearSearch(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key)
                    return i; // return index
            }
            return -1; // not found
        }

        public static void main(String[] args) {
            int[] arr = {4, 2, 5, 7, 1, 3};

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number to search: ");
            int key = sc.nextInt();

            int result = linearSearch(arr, key);
            if (result == -1)
                System.out.println("Element not found.");
            else
                System.out.println("Element found at index: " + result);
    }
}
