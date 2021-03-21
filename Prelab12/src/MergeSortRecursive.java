public class MergeSortRecursive {
    static void mergesort(Integer [] arr,  int firstIndex, int lastIndex){

        if(firstIndex < lastIndex){
            int middle = (firstIndex + lastIndex )/ 2;
            mergesort(arr, firstIndex, middle);
            mergesort(arr, middle + 1,lastIndex );
            merge(arr,  firstIndex, middle, middle + 1, lastIndex);
        }
    }
    static void merge(Integer [] arr,  int firstArrayFirstIndex, int firstArrayLastIndex,
                      int secondArrayFirstIndex, int secondArrayLastIndex){
        Integer tmpArr[]= new Integer[arr.length];
        for(int i = firstArrayFirstIndex ; i <= firstArrayLastIndex ;i++){
            tmpArr[i] = arr[i];
        }
        for(int i = secondArrayFirstIndex ; i <= secondArrayLastIndex ;i++){
            tmpArr[i] = arr[i];
        }
        int index = firstArrayFirstIndex;
        while(firstArrayFirstIndex <= firstArrayLastIndex && secondArrayFirstIndex <= secondArrayLastIndex){
            // equality is for merging arrays of size 1
            if(tmpArr[secondArrayFirstIndex] < tmpArr[firstArrayFirstIndex]) {
                arr[index] = tmpArr[secondArrayFirstIndex];
                secondArrayFirstIndex++;
            }else if(tmpArr[firstArrayFirstIndex] < tmpArr[secondArrayFirstIndex]){
                arr[index] = tmpArr[firstArrayFirstIndex];
                firstArrayFirstIndex++;
            }
            index++;
        }
        while(firstArrayFirstIndex <= firstArrayLastIndex){
            arr[index] = tmpArr[firstArrayFirstIndex];
            firstArrayFirstIndex++;
            index++;
        }
        while(secondArrayFirstIndex <= secondArrayLastIndex){
            arr[index] = tmpArr[secondArrayFirstIndex];
            secondArrayFirstIndex++;
            index++;
        }
    }

    public static void main(String args[]){
        Integer []arr = {2, 1, 4, 3};
        //Integer []tmpArr = new Integer[arr.length];
        mergesort(arr,0, arr.length - 1);

        for (Integer x: arr){
            System.out.print(x);
        }



        System.out.println();

        Integer []arr2 = {4, 3 , 2, 1, 0};
        //Integer []tmpArr = new Integer[arr.length];
        mergesort(arr2,0, arr2.length - 1);

        for (Integer x: arr2){
            System.out.print(x);
        }
    }
}
