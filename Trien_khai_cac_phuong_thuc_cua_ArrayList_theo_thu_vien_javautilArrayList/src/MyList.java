import java.util.Arrays;

public class MyList<E> {
    int size=0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    private void increaseCapa(){
        elements= Arrays.copyOf(elements,elements.length*2);
    }
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public  MyList(int capacity){
        elements = new Object[capacity];
        size=elements.length;
    }
    public MyList(E[] arr){
        elements = Arrays.copyOf(arr, arr.length);
        size=elements.length;
    }
    public void add(E e) {
        if (size == elements.length) {
            increaseCapa();
        }
        elements[size++] = e;
    }
    void add(int index, E element){
        increaseCapa();
        for (int i = size-1; i >index ; i--) {
            elements[i + 1]=elements[i];
        }
        elements[index]=element;
        size++;
    }
    void remove(int index){
        for (int i = index; i < size; i++) {
            elements[i]=elements[i+1];
        }
        size--;
    }
    int size(){
        return size;
    }
    boolean contains(E index){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i]==index){
                return true;
            }
        }
        return false;
    }

    void printArr(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+", ");
        }
    }
}
