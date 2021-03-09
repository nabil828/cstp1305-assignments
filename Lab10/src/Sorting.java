import java.util.Arrays;

public class Sorting {

    // post-condition: this function print out the sorted array of the input
    // this function should not alter the original array
    static void selection_sort( int arr[]){
            // 1- find the smallest element in the unsorted part of the array
        int smallest_index;
        for(int i = 0; i < arr.length ; i++){
            smallest_index = i;
            for (int j = i + 1; j < arr.length ; j++){
                if(arr[j] < arr[smallest_index]){
                    smallest_index = j;
                }
            }
            // 2 - swap this smallest with the first element of the unsorted part of the array
            int tmp = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i] = tmp;
        }

        for(int x = 0 ; x < arr.length; x++){
            System.out.println(arr[x]);
        }


    }

    public static void main (String arf[]){
        System.out.println("Hi");
        int [] arr = {23, 41, 33, 81, 07, 19, 11, 45};
        selection_sort(arr);
    }
}
