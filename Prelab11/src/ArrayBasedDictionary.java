class Pairs{
    Integer key;
    String value;
    boolean isFilled;

    public Pairs(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class ArrayBasedDictionary implements DictionaryInterface {
    Pairs arr[];
    int SIZE = 10;
    int size;
    public ArrayBasedDictionary(){
        arr = new Pairs[SIZE];
        size =0;
    }

    public void add(Integer key , String value){
        // first, we have to check if the element is in the dictionary
        // we have to apply linear search to find whether the element exist or not
        // If it exists, then we have to replace overwrite its value

        for(int i = 0 ; i < size; i++){
            if(arr[i].key == key)
                arr[i].value = value;
        }

        // otherwise, we may insert it in any empty location
        arr[size]= new Pairs(key, value);
        size++;
    }

    public void remove(Integer key){
        // check if the key is in the collection
        // if it exists, shift all the elements on the right one position to the left
        int found = -1;
        for(int i = 0 ; i < size; i++){
            if(arr[i].key == key)
                found = i;
        }
        if(found != -1){

            arr[found]= arr[size - 1];
            size--;
        }else{
            //what happens it the key does not exist
            // may be nothing
        }

    }

    public String getValue(Integer key){

        //searching
        for(int i = 0 ; i < SIZE; i++){
            if(arr[i].key == key)
                return  arr[i].getValue();
        }
        // if it does not exist
        return  null;
    }
    public boolean contains(Integer key){
        //searching
        for(int i = 0 ; i < size; i++){
            if(arr[i].key == key)
                return  true;
        }
        // if it does not exist
        return  false;
    }


    public boolean isEmpty(){
        return  size == 0;
    }


    public static void main (String args[]){
        DictionaryInterface aDictionary = new ArrayBasedDictionary();
        aDictionary.add(1, "nabil");
        aDictionary.add(23, "Micheal");
        aDictionary.add(14, "Eric");
        aDictionary.remove(14);
        aDictionary.isEmpty();
        aDictionary.getValue(23); // should be Micheal
        aDictionary.contains(23); // should be true
        aDictionary.contains(14); // should be false

    }
}
