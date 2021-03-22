public class MergeSortRecursive {
    static void mergesort(Integer [] arr,  Integer[] tmpArr, int firstIndex, int lastIndex){

//        if(firstIndex < lastIndex){
//            int middle = (firstIndex + lastIndex )/ 2;
//            mergesort(arr, tmpArr, firstIndex, middle);
//            mergesort(arr, tmpArr,middle + 1,lastIndex );
//            merge(arr,  tmpArr, firstIndex, middle, middle + 1, lastIndex);
//            System.arraycopy(tmpArr, firstIndex, arr, firstIndex, lastIndex - firstIndex + 1 );
//        }

        int length = 1;
        while(length < arr.length){
            int i = 0;
            while(i <= lastIndex){
                int L1 = i;
                int R1 = L1 + length -1;
                int L2= R1 + 1;
                int R2 = L2 + length - 1;

                if(L2 > lastIndex + 1)
                    break;

                // out of bound R2
                if(R2 > lastIndex)
                    R2 = lastIndex;

                merge(arr,  tmpArr, L1, R1, L2 , R2);
                System.arraycopy(tmpArr, L1, arr, L1, R2 - L1 + 1 );

                i +=  (2 * length);
             }
            length *= 2;
        }
    }

    static void merge(Integer [] arr, Integer [] tmpArr,  int firstArrayFirstIndex, int firstArrayLastIndex,
                      int secondArrayFirstIndex, int secondArrayLastIndex){

        int index = firstArrayFirstIndex;
        while(firstArrayFirstIndex <= firstArrayLastIndex &&
                secondArrayFirstIndex <= secondArrayLastIndex){
            // equality is for merging arrays of size 1
            if(arr[secondArrayFirstIndex] < arr[firstArrayFirstIndex]) {
                tmpArr[index] = arr[secondArrayFirstIndex];
                secondArrayFirstIndex++;
            }else if(arr[firstArrayFirstIndex] < arr[secondArrayFirstIndex]){
                tmpArr[index] = arr[firstArrayFirstIndex];
                firstArrayFirstIndex++;
            }
            index++;
        }
        while(firstArrayFirstIndex <= firstArrayLastIndex){
            tmpArr[index] = arr[firstArrayFirstIndex];
            firstArrayFirstIndex++;
            index++;
        }
        while(secondArrayFirstIndex <= secondArrayLastIndex){
            tmpArr[index] = arr[secondArrayFirstIndex];
            secondArrayFirstIndex++;
            index++;
        }


    }

    public static void main(String args[]){
        Integer []arr = {2, 1, 4, 3};
        Integer []tmpArr = new Integer[arr.length];
        mergesort(arr, tmpArr, 0, arr.length - 1);

        for (Integer x: tmpArr){
            System.out.print(x);
        }

        System.out.println();

        Integer []arr2 = {4, 3 , 2, 1, 0};
        Integer []tmpArr2 = new Integer[arr2.length];
        mergesort(arr2, tmpArr2, 0, arr2.length - 1);

        for (Integer x: tmpArr2){
            System.out.print(x);
        }
    }
}
