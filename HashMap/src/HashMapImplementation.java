import java.security.Key;
import java.util.LinkedList;
import java.util.Map;

public class HashMapImplementation {

    static class MyHashMap<K , V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n ;
        private LinkedList<Node> [] buckets ;


        private void initBucket(int N){ // N ==> size or capacity of the buckets
            buckets = new LinkedList[N];
            for (int i = 0 ; i < buckets.length ; i++){
                //initial every index or buckets with empty linkedList
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hashCode = key.hashCode();
            return (Math.abs(hashCode)) % buckets.length;
        }

        private void rehash(){
            LinkedList<Node> [] oldBucket = buckets;
            initBucket(buckets.length * 2);
            n = 0;
            for (var bucket : oldBucket){
                for (var node : bucket){
                    put(node.key , node.value);
                }
            }
        }


        public MyHashMap(){
            initBucket(DEFAULT_CAPACITY);
        }

        //Traverse LinkedList to know the key is present or not
        private int searchInBucket(LinkedList<Node> buck, K key){
            for (int i = 0; i < buck.size() ; i++) {
                if (buck.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }


        public int size(){ // return the size of the hashmap
            return n;
        }

        public void put(K key , V value){ // inserting/updating
            int bucketIndex = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int EntryIndex = searchInBucket(currentBucket , key);
            if (EntryIndex == -1){ // key doesn't exist we have to insert the new node
                Node node = new Node(key, value);
                //Adding new node
                currentBucket.add(node);
                n++;
            }else{ // update
                Node currentNode = currentBucket.get(EntryIndex);
                currentNode.value = value;
            }

            if (n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){ // getting the value of the key
            int bucketIndex = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int EntryIndex = searchInBucket(currentBucket , key);
            if (EntryIndex != -1){ // key exists
                Node currentNode = currentBucket.get(EntryIndex);
                return currentNode.value;
            }
            return null;
        }



        public V remove(K key){ // remove the element form the map with the help of key
            int bucketIndex = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int EntryIndex = searchInBucket(currentBucket,key);
            if (EntryIndex != -1){
                Node currentNode = currentBucket.get(EntryIndex);
                V val = currentNode.value;
                currentBucket.remove(EntryIndex);
                n--;
                return val;
            }
            return null;
        }

        public boolean contains(K key){ // check key is present or absent
            int bucketIndex = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int EntryIndex = searchInBucket(currentBucket , key);
            return (EntryIndex != -1);
        }


        public int capacity(){
            return buckets.length;
        }

        public float LoadFactor(){
            return buckets.length * DEFAULT_LOAD_FACTOR;
        }

    }

    public static void main(String[] args){
        MyHashMap<String , Integer> myHashMap = new MyHashMap<>();
        System.out.println("Testing put");
        myHashMap.put("a" , 1);
        myHashMap.put("b" , 2);
        myHashMap.put("c" , 3);
        myHashMap.put("e" , 100);
        myHashMap.put("t" , 100);
        myHashMap.put("5" , 100);
        myHashMap.put("62" , 100);
        myHashMap.put("c5" , 100);
        myHashMap.put("c21" , 100);

        System.out.println("Testing size");
        System.out.println(myHashMap.size());

        System.out.println("Testing get");
        System.out.println(myHashMap.get("c"));

        System.out.println("Testing remove");
        System.out.println(myHashMap.remove("b"));

        System.out.println("Testing contains");
        System.out.println(myHashMap.contains("c"));

        System.out.println("Testing capacity");
        System.out.println(myHashMap.capacity());

        System.out.println("Testing LoadFactor");
        System.out.println(myHashMap.LoadFactor());

    }
}
