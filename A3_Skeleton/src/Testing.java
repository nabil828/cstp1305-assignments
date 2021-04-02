import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static java.lang.Thread.sleep;


public class Testing {




    public static void main(String args[]) {
        // ******************************
        // ** Timing Search Algorithms **
        // ******************************

        // create an array of size 100000 * i
        Integer[] arr = new Integer[1000000];
        // fill it with numbers 0, 1, 2, 3, .. etc
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j;
        }

        int sumLinearTime = 0;
        int sumBinaryTime = 0;
        int sumMergeTime = 0;
        int sumHeapTime = 0;
        int sumSelectionSortTime = 0;
        int sumInsertionSortTime =-0 ;

        Instant start;
        Instant finish;

        long elapsedTime;

//        #The input size n can range from hundred thousand to a million,
//        #in increments of fifty thousand
        // Let us sort 100 arrays
        for (int i = 100000; i <= 10000000; i = i + 50000) {
//             #We do 100 trials for each value of n
//            System.out.println(i);
            for (int j = 0; j <= 1000; j = j + 1) {
                // Randomly, pick a key to find
                Random rand = new Random();
                int randomNum = rand.nextInt(arr.length);
                // Time the execution
//              Date current = new Date();
                start = Instant.now();
                assert (Algorithms.linear_search(arr, randomNum) != -1);
                finish = Instant.now();
                elapsedTime = Duration.between(start, finish).toNanos();//.toNanos();; // In NanoSeconds
                sumLinearTime += elapsedTime;

                start = Instant.now();
                assert (Algorithms.binary_search(arr, randomNum) != -1);
                finish = Instant.now();
                elapsedTime = Duration.between(start, finish).toNanos();//.toNanos();; // In NanoSeconds
                sumBinaryTime += elapsedTime;


            }
        }
        // ******************************
        // ** Result Summary           **
        // ******************************
        System.out.println("Linear Search Total Time: " + sumLinearTime + " - Binary Search Total Time: " + sumBinaryTime);




        // ******************************
        // ** Timing Sorting Algorithms **
        // ******************************

        // for REPETITIONS times, shuffle and sort the array
        int REPETITIONS = 1000;
        int ARRAY_SIZE_INCREMENT_FACTOR = 10;
        int ARRAY_INITIAL_SIZE = 50;

//        System.out.println("Merge Sort Data points:");
//        for (int i = 0 ; i < REPETITIONS; i++){
//            arr = new Integer[ARRAY_INITIAL_SIZE + (i * ARRAY_SIZE_INCREMENT_FACTOR)];
//            // fill it with numbers 0, 1, 2, 3, .. etc
//            for (int j = 0; j < arr.length; j++) {
//                arr[j] = j;
//            }
//
//            // Shuffle the array
//            List<Integer> intList = Arrays.asList(arr);
//            Collections.shuffle(intList);
//            intList.toArray(arr);
//
//            // Testing Merge Sort
//            start = Instant.now();
//            Integer []tmpArr= new Integer[arr.length];
//            Algorithms.mergesort(arr, tmpArr, 0, arr.length -1);
//            finish = Instant.now();
//            elapsedTime = Duration.between(start, finish).toNanos();//.toNanos();; // In NanoSeconds
//            System.out.print(elapsedTime + ", ");
//            sumMergeTime += elapsedTime;
//        }


//        System.out.println("\nHeap Sort Data points:");
//        for (int i = 0 ; i < REPETITIONS; i++) {
//            arr = new Integer[ARRAY_INITIAL_SIZE + (i * ARRAY_SIZE_INCREMENT_FACTOR)];
//            // fill it with numbers 0, 1, 2, 3, .. etc
//            for (int j = 0; j < arr.length; j++) {
//                arr[j] = j;
//            }
//
//            // Shuffle the array
//            List<Integer> intList = Arrays.asList(arr);
//            Collections.shuffle(intList);
//            intList.toArray(arr);
//
//            // for 100 times, shuffle and HeapSort the array
//            start = Instant.now();
//            Heap obj = new Heap(arr);
//            obj.heapSort();
//            finish = Instant.now();
//            elapsedTime = Duration.between(start, finish).toNanos();//.toNanos();; // In NanoSeconds
//            System.out.print(elapsedTime + ", ");
//            sumHeapTime += elapsedTime;
//        }
//        // ******************************
//        // ** Result Summary           **
//        // ******************************
//        System.out.println("\nMergeSort Total Time: " + sumMergeTime + " - HeapSort Total Time: " + sumHeapTime);
//
//
        System.out.println("Selection Sort Data points:");
        for (int i = 0 ; i < REPETITIONS; i++) {
            arr = new Integer[ARRAY_INITIAL_SIZE+ (i * ARRAY_SIZE_INCREMENT_FACTOR)];
            // fill it with numbers 0, 1, 2, 3, .. etc
            for (int j = 0; j < arr.length; j++) {
                arr[j] = j;
            }

            // for 100 times, shuffle and HeapSort the array
            // Shuffle the array
            List<Integer> intList = Arrays.asList(arr);
            Collections.shuffle(intList);
            intList.toArray(arr);

            start = Instant.now();
            Algorithms.selectionSort(arr);
            finish = Instant.now();
            elapsedTime = Duration.between(start, finish).toNanos();//.toNanos();; // In NanoSeconds
            System.out.print(elapsedTime + ", ");
            sumSelectionSortTime += elapsedTime;

        }
//
//        System.out.println("\nInsertion Sort Data points:");
//        for (int i = 0 ; i < REPETITIONS; i++) {
//            arr = new Integer[ARRAY_INITIAL_SIZE + (i * ARRAY_SIZE_INCREMENT_FACTOR)];
//            // fill it with numbers 0, 1, 2, 3, .. etc
//            for (int j = 0; j < arr.length; j++) {
//                arr[j] = j;
//            }
//
//            // for 100 times, shuffle and HeapSort the array
//            // Shuffle the array
//            List<Integer> intList = Arrays.asList(arr);
//            Collections.shuffle(intList);
//            intList.toArray(arr);
//
//            start = Instant.now();
//            Algorithms.insertionSort(arr);
//            finish = Instant.now();
//            elapsedTime = Duration.between(start, finish).toNanos();//.toNanos();; // In NanoSeconds
//            System.out.print(elapsedTime + ", ");
//            sumInsertionSortTime += elapsedTime;
//
//        }
//        // ******************************
//        // ** Result Summary           **
//        // ******************************
//        System.out.println("\nSelectionSort Total Time: " + sumSelectionSortTime + " - InsertionSort Total Time: " + sumInsertionSortTime );

    }
}