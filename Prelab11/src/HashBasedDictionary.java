enum Occupancy { //for probing
    OCCUPIED,
    AVAILABLE,
    EMPTY
}

public class HashBasedDictionary implements DictionaryInterface{
    Pair hashTable[]; // it is just an array :)
    int SIZE = 23;
    int size;
    public HashBasedDictionary(){
        hashTable = new Pair[SIZE];
        size =0;
    }

    //from page 617 in the book
    private int hashCode(String input){
        int hash = 0;
        int n = input.length ();
        for (int i = 0; i < n; i++){
            hash = 31 * hash + input.charAt(i);
        }
        return hash;
    }

    //from page 619 in the book
    private int getHashIndex(Integer key){
//        int hashIndex = hashCode(key.toString()) % hashTable.length;
        int hashIndex = key % hashTable.length;
        if(hashIndex < 0)
            hashIndex = hashIndex % hashTable.length;

        return hashIndex;
    }

    //from page 625 in the book
    private int linearProbe(int index, Integer key){
        boolean found = false;
        int availableStateIndex = -1;
        while (!found && (hashTable[index] != null)){
            if(hashTable[index].getOccupancy() != Occupancy.AVAILABLE){
                if(key.equals(hashTable[index].getKey()))
                    found = true;
                else
                    index = (index + 1) % hashTable.length;
            }else{
                if( availableStateIndex == -1)
                    availableStateIndex = index;

                index = (index + 1) % hashTable.length;
            }
        }
        if (found || availableStateIndex == -1)
            return index;
        else
            return availableStateIndex;
    }

    // from page 648 in the book
    public void add(Integer key , String value){
        // first, we have to check if the element is in the dictionary
        // we have to apply linear search to find whether the element exist or not

        //        for(int i = 0 ; i < size; i++){
        //            if(arr[i].key == key)
        //                arr[i].value = value;
        //        }
        int index = getHashIndex(key); // O(1)
        int probeIndex = linearProbe(index, key);
        if(hashTable[probeIndex] == null || hashTable[probeIndex].getOccupancy() == Occupancy.AVAILABLE){
            // not found, we may insert it in any empty location
            hashTable[probeIndex] = new Pair(key, value, Occupancy.OCCUPIED);
            size++;
        }else { // If it exists, then we have to replace overwrite its value
            hashTable[probeIndex].setValue(value); // new value
            hashTable[probeIndex].setOccupancy(Occupancy.OCCUPIED);
        }
        // enlarge if necessary
    }

    public void remove(Integer key){
        // check if the key is in the collection
        // if it exists, shift all the elements on the right one position to the left
//        int found = -1;
//        for(int i = 0 ; i < size; i++){
//            if(arr[i].key == key)
//                found = i;
//        }
        int index = getHashIndex(key);
        int probeIndex = linearProbe(index, key);
        if(probeIndex != -1){ // found
//            arr[found]= arr[size - 1];
            hashTable[probeIndex].setOccupancy(Occupancy.AVAILABLE);
            size--;
        }else{
            //what happens it the key does not exist
            // may be nothing
        }

    }

    public String getValue(Integer key){
        //searching
//        for(int i = 0 ; i < SIZE; i++){
//            if(arr[i].key == key)
//                return  arr[i].getValue();
//        }
        int index = getHashIndex(key);
        int probeIndex = linearProbe(index, key);
        if(hashTable[probeIndex] != null && hashTable[probeIndex].getOccupancy() != Occupancy.AVAILABLE)
            return  hashTable[index].getValue();
        // if it does not exist
        return  null;
    }
    public boolean contains(Integer key){
        //searching
//        for(int i = 0 ; i < size; i++){
//            if(arr[i].key == key)
//                return  true;
//        }
        // if it does not exist
        return  getValue(key) != null;
    }


    public boolean isEmpty(){
        return  size == 0;
    }


    public static void main (String args[]){
        DictionaryInterface aDictionary = new HashBasedDictionary();
        aDictionary.add(58, "nabil");
        aDictionary.add(81, "Micheal");
        aDictionary.add(35, "Eric");
        aDictionary.add(60, "Cody");
        aDictionary.add(81, "Micheal2");
        aDictionary.remove(81);
        aDictionary.add(81, "Micheal3");
        aDictionary.isEmpty();
        aDictionary.getValue(23); // should be Micheal
        aDictionary.contains(23); // should be true
        aDictionary.contains(14); // should be false

    }

}


class Pair{
    Integer key;
    String value;
    Occupancy occupancy;


    public Pair(Integer key, String value, Occupancy occupancy) {
        this.key = key;
        this.value = value;
        this.occupancy = occupancy;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }
}

