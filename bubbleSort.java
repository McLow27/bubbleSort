public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 6, 2, 4, 7 }; // Array of numbers
        for (int num : arr) { // Enhanced loop to iterate through the array
            System.out.println("Before: " + num); // Prints what is in the array before swapping
        }
        boolean swap = true;
        while (swap) { // While loop to check if there is an element that needs to be swapped
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { // element is greater than the next element swap
                    swap = true; // set to true because element needs swap
                    int initial = arr[i]; // variable to save original
                    arr[i] = arr[i + 1]; // first element swaps with next element
                    arr[i + 1] = initial; // swaps back to original element
                }
                System.out.println("After: " + arr[i]); // Prints the elements sorted in the correct order
            }
        }
    }
}
