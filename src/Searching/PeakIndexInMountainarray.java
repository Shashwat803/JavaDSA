package Searching;

public class PeakIndexInMountainarray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        int output = peakmountain(nums);
        System.out.println(output);
    }

    public static int peakmountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
//             checking for highest element
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
//             checking if we are in ascending part
            else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1; //reducing search area
            }
//             checking if we are in decending part
            else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1; // reducing search area
            }
        }
        return -1;
    }
}

