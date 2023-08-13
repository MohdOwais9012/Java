import java.util.*;
public class Sorting {

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = 0; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;

        }
        while( j < second.length){
            mix[j] = second[j];
            k++;
            j++;
        }
        return mix;

    }
    static void mergeSort(int[] arr, int s, int e){

        if(e - s == 1){
            return;
        }
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        mergeS(arr, s, mid, e);


    }
    static void  mergeS( int[] arr, int s, int mid, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while( i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];

        }
    }
    // Selection Sort
    static void quicksort(int[] arr, int low, int hi){
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while(s <= e){
            while(pivot > arr[s]){
                s++;
            }
            while(pivot < arr[e]){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is correct index now sort two halves
        quicksort(arr, low, e );
        quicksort(arr, s, hi);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


}
