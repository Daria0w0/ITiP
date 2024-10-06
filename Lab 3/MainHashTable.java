public class MainHashTable {   
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>(10);
        hashTable.put("apple", 5);
        hashTable.put("banana", 3);
        hashTable.put("orange", 7);
        
        System.out.println("HashTable: " + hashTable);
        System.out.println("Get apple: " + hashTable.get("apple"));
        System.out.println("Size: " + hashTable.size());
        
        hashTable.remove("banana");
        System.out.println("After removing banana: " + hashTable);
        System.out.println("Is empty: " + hashTable.isEmpty());
    }  
}