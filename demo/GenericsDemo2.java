package demo;

class GenericsDemo<T> {
    private T item; 
    
    public void setItem(T item) {
        this.item = item;
    } 
    public T getItem() {
        return item;
    }
}
class Utility {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}

public class GenericsDemo2 {
    public static void main(String[] args) {
     
        GenericsDemo<Integer> intStorage = new GenericsDemo<>();
        intStorage.setItem(42);
        System.out.println("Stored Integer: " + intStorage.getItem());
     
        GenericsDemo<String> strStorage = new GenericsDemo<>();
        strStorage.setItem("Hello, Generics!");
        System.out.println("Stored String: " + strStorage.getItem());

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};

        System.out.println("Integer Array:");
        Utility.printArray(intArray);

        System.out.println("String Array:");
        Utility.printArray(strArray);
    }
}
