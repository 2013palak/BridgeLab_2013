import java.util.*;

public class GoodSubarrayMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, maxSum = 0, currSum = 0;

        for (int right = 0; right < n; right++) {
            freq.put(A[right], freq.getOrDefault(A[right], 0) + 1);
            currSum += A[right];

            while (freq.size() > k) {
                freq.put(A[left], freq.get(A[left]) - 1);
                if (freq.get(A[left]) == 0) freq.remove(A[left]);
                currSum -= A[left];
                left++;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}