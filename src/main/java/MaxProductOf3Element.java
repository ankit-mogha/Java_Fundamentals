import java.util.Arrays;

public class MaxProductOf3Element {
    public static int maxProduct(int arr[]) {
        if(arr.length < 3) {
            return -1;
        }
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[1] * arr[arr.length-1], arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3]);
    }
}
