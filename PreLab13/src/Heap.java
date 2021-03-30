public class Heap {
    int []arr;
    int last_index = 0;
    Heap(){
        arr = new int[20]; // todo: enlarge()
    }

    Heap(int unordered_array[]){
        //todo
    }
    void insert(int x){
        // first step: insert at the last index
        arr[last_index] = x;

        // second step: Fix the partial ordering
        int iterator = last_index;
        int parent_index = (int) Math.floor((iterator* 1.0 - 1 )  / 2);
        while( parent_index >= 0 && arr[parent_index] < arr[iterator]){
            swap(parent_index, iterator);
            // moving to the next iteration
            iterator = parent_index;
            parent_index = (int) Math.floor((parent_index* 1.0 - 1 )  / 2);
        }
        last_index++;
    }

    void remove(){
        //        step 1
        //        Make a temporary copy of the root’s data
//        int tmp = arr[0];

        // Step 2
        //        Similarly to the insertion algorithm, first ensure that the heap remains complete
        //        Replace the root node with the right-most leaf
        //        i.e. the highest (occupied) index in the array
        arr[0] = arr[last_index - 1];

        // Step 3
        //        Swap the new root with its largest valued child until the partially ordered property holds
        //        i.e. bubble down
        // todo
        int iterator = 0;
        int left_child_index = 2 * iterator  + 1;
        int right_child_index = 2 * iterator  + 2;
        while(left_child_index < last_index) {
            //find the max value child
            int max_child_index = right_child_index;
            if(arr[left_child_index] > arr[right_child_index])
                max_child_index = left_child_index;

            swap(iterator, max_child_index);

            // move the iterator
            iterator = max_child_index;
            left_child_index = 2 * iterator  + 1;
            right_child_index = 2 * iterator  + 2;
        }
    last_index--;

    }
//   bubbleUP(int index); // todo

//   bubbleDown(int index); // todo

//   heapSort(); // todo
    void swap(int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int peek(){
        return arr[0];
    }


    public static void main(String args[]){


        Heap obj = new Heap();
        obj.insert(9);
        obj.insert(10);
        obj.insert(13);
        obj.insert(65);
        obj.insert(44);
        obj.insert(23);
        obj.insert(86);
        obj.insert(98);
        obj.insert(41);
        obj.insert(32);
        obj.insert(17);
        obj.insert(21);
        obj.insert(29);
        System.out.println(obj.peek());// return 94
        obj.remove();
        obj.printAll(); // lab work: implement this method without destroying the heap array

    }
}
