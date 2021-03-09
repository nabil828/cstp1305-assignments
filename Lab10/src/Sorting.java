import java.util.Arrays;

public class Sorting {
    // post-condition: this function print out the sorted array of the input
    // this function should not alter the original array
    static void insertion_sort(int arr[]){

        for(int current_index_unsorted = 0 ; current_index_unsorted < arr.length; current_index_unsorted++){
            int tmp = arr[current_index_unsorted];
            // look up step, trying to find where to insert the current item
            int iterator = current_index_unsorted;
            while( iterator > 0 && tmp < arr[iterator -1]){
                arr[iterator] = arr[iterator -1];
                iterator --;
            }
            arr[iterator]= tmp; //Insertion step
        }


        for(int x = 0 ; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
    }

    // post-condition: this function print out the sorted array of the input
    // this function should not alter the original array
    static void selection_sort( int arr[]){
            // 1- find the smallest element in the unsorted part of the array
        int smallest_index;
        for(int i = 0; i < arr.length ; i++){
            smallest_index = i;
            for (int j = i + 1 ; j < arr.length ; j++){
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
            System.out.print(arr[x] + " ");
        }


    }

    public static void main (String arf[]){
        System.out.println("Hi");
        int [] arr = {23, 41, 33, 81, 07, 19, 11, 45};
        insertion_sort(arr);
    }
}
