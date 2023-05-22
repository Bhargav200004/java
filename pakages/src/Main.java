public class Main {
        static class MyClass {
            int value;}

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Creating an instance of MyClass
        obj1.value = 10; // Accessing object's field through the reference

        MyClass obj2 = obj1; // Assigning the reference of obj1 to obj2
        System.out.println(obj2.value); // Output: 10

        obj2.value = 20; // Modifying the object's field through obj2 reference
        System.out.println(obj1.value); // Output: 20 (both references point to the same object)
    }
}