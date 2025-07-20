public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 3, 5, 0, 0, 3, 1, 4};
        int n = arr.length;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int profit1 = 0;
            int profit2 = 0;

            // Max profit in first part [0..i]
            for (int j = 0; j < i; j++) {
                for (int k = j + 1; k <= i; k++) {
                    int p1 = arr[k] - arr[j];
                    if (p1 > profit1) {
                        profit1 = p1;
                    }
                }
            }

            // Max profit in second part [i+1..n-1]
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int p2 = arr[k] - arr[j];
                    if (p2 > profit2) {
                        profit2 = p2;
                    }
                }
            }

            maxProfit = Math.max(maxProfit, profit1 + profit2);
        }

        System.out.println("Maximum Profit with at most 2 transactions: " + maxProfit);
    }
}
