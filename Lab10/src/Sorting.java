import java.util.Arrays;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Sorting {


    // post-condition: this function print out the sorted array of the input
    // post-condition: this function should alter the orginal list
    static void insertion_sort_for_linked_lists(Node head) {

        Node new_list = null; //  5 -> 9

        Node outer_iterator = head;
        while(outer_iterator != null){//         // 5 -> 9 -> 7 -> 1 -> 2 ->null

            if(new_list == null){
                new_list = new Node(outer_iterator.data);
            }else if (outer_iterator.data< new_list.data)
            {
                Node new_node = new Node(outer_iterator.data);
                new_node.next = new_list;
                new_list = new_node;
            }
            else {
                Node i = new_list;
                Node prev = i;
                while (i.next != null && outer_iterator.data > i.data) {
                    prev = i;
                    i = i.next;
                }
                Node new_node = new Node(outer_iterator.data);
                if(prev.next != null)
                    new_node.next = i;

                prev.next = new_node;
            }


            outer_iterator = outer_iterator.next;
        }

        Node iterator = new_list;
        while(iterator != null){
            System.out.print(iterator.data + " ");

            iterator = iterator.next;
        }

    }
    // post-condition: this function print out the sorted array of the input
    // post-condition: this function should not alter the original array
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
    // post-condition: this function should not alter the original array
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
//        insertion_sort(arr);


        Node a = new Node(5);
        a.next = new Node( 9);
        a.next.next = new Node(7);
        a.next.next.next = new Node(1);
        a.next.next.next.next = new Node(2);
        // 5 -> 9 -> 7 -> 1 -> 2 ->null
        insertion_sort_for_linked_lists(a);
    }
}
