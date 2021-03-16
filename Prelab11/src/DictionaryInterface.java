public interface DictionaryInterface {
    // post-condition: Add this pair into the dictionary
    //                 If this key exist, replace the old value with the new value
    // key: is the identifier property of any elements
    // value: the value asscociate with the key
    public void add(Integer key , String value);

    // post-condition: Should remove specific pair that has the key provided from the collection
    // pre-condition: key should exist, otherwise do nothing
    // key: is the identifier property of any elements
    public void remove(Integer key);

    // Retrieve the value associated with a specific key if it exists, otherwise return null
    public String getValue(Integer key);

    public boolean contains(Integer key);


    public boolean isEmpty();
}
