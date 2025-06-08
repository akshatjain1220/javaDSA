import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0};  // ✅ correct array initialization
        int n = arr.length;
        int count = 0;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == flag) {  // ✅ comparison using ==
                flag ^= 1;          // toggle flag between 0 and 1
                count++;
            }
        }

        System.out.println(count);  // ✅ print final result
    }
}
