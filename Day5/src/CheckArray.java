//To check whether an array is sorted or Not.
public class CheckArray {
    public static boolean isSorted(int[] arr) {
        // An empty array or an array with one element is always sorted
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Compare every element to its successor
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found an element out of order
            }
        }
        return true; // The array is completely sorted
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50};
        int[] unsortedArray = {10, 30, 20, 40, 50};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray));     // Output: true
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray)); // Output: false
    }
}
