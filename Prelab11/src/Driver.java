import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ExtendedAddress{
    String email;
    String phoneNumber;
    String address;

    public ExtendedAddress(String email, String phoneNumber, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
public class Driver {

    public static void main(String args[]){
        Map<String, ExtendedAddress> addressBook = new HashMap<>();
        addressBook.put("Nabil",  new ExtendedAddress("nabil@plapla.com", "6044559872", "508 Thasd St. Coquitlam"));
        addressBook.put("Cody",   new ExtendedAddress("nabil@plapla.com", "6044559872", "508 Thasd St. Coquitlam"));

        // New example: Union and Intersection of two arrays
        Integer arr1 [] = {1, 2, 3, 4, 5};
        Integer arr2 [] = {4, 5, 6, 7, 8};
//        intersection_of_two_arrays(arr1, arr2); // should be 4, 5
//        union_of_two_arrays(arr1, arr2); // should be 1, 2, 3, 4, 5, 6, 7, 8,
//        intersection_of_two_arrays_using_sets(arr1, arr2);
        union_of_two_arrays_using_sets(arr1, arr2);
    }

    private static void union_of_two_arrays_using_sets(Integer[] arr1, Integer[] arr2) {
        Set<Integer> tmp = new HashSet<>();
        for (int i = 0 ; i < arr1.length; i++){
            tmp.add(arr1[i]);
        }
        for (int i = 0 ; i < arr2.length; i++){
            tmp.add(arr2[i]);
        }
        for (Integer i : tmp){
            System.out.println(i);
        }

    }

    private static void intersection_of_two_arrays_using_sets(Integer[] arr1, Integer[] arr2) {
        Set<Integer> tmp = new HashSet<>();
        for (int i = 0 ; i < arr1.length; i++){
            tmp.add(arr1[i]);
        }
        for (int i = 0 ; i < arr2.length; i++){
         if(tmp.contains(arr2[i])){
             System.out.println(arr2[i]);
         }

        }
    }

    private static void union_of_two_arrays(Integer[] arr1, Integer[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0 ; i<arr1.length; i++){
            if(frequencyMap.containsKey(arr1[i])){
                frequencyMap.put(arr1[i],  frequencyMap.get(arr1[i]) + 1);
            }else{
                frequencyMap.put(arr1[i], 1);
            }
        }
        for (int i = 0 ; i<arr2.length; i++){
            if(frequencyMap.containsKey(arr2[i])){
                frequencyMap.put(arr2[i],  frequencyMap.get(arr2[i]) + 1);
            }else{
                frequencyMap.put(arr2[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    private static void intersection_of_two_arrays(Integer[] arr1, Integer[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0 ; i<arr1.length; i++){
            if(frequencyMap.containsKey(arr1[i])){
                frequencyMap.put(arr1[i],  frequencyMap.get(arr1[i]) + 1);
            }else{
                frequencyMap.put(arr1[i], 1);
            }
        }

        for (int i = 0 ; i<arr2.length; i++){
            if(frequencyMap.containsKey(arr2[i])){
                frequencyMap.put(arr2[i],  frequencyMap.get(arr2[i]) + 1);
            }else{
                frequencyMap.put(arr2[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() == 2)
                System.out.println(entry.getKey());
        }
    }
}
