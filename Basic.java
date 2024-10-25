package Bubblesort;

public class Basic {
   
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break;  // No swap means array is already sorted
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 1, 4, 2, 5, 6};
            bubbleSort(arr);
            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    

