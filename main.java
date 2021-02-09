public class main {


    static int binary_search(int arr[], int target){

        int lower = 0;
        int upper = arr.length -1 ;

        while( lower < upper){
            int middle =(lower + upper )/ 2;
            if (arr[middle] == target)
                return middle;
            else{
                if(target < arr[middle]){
                    upper = middle - 1;
                }else{
                    lower = middle + 1;
                }
            }
        }
        return -1;
    }
    // if the target not found, reutrn -1
    static int linear_search(int arr[], int target){
        for(int i =0; i < arr.length ; i++){
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {
        System.out.println(" Hello world!");
        int arr[] = new int[11];
        for(int i =0 ; i < arr.length; i++)
            arr[i] = i * 2;
        int result = binary_search(arr, 6);
        System.out.println(result);
    }
}
