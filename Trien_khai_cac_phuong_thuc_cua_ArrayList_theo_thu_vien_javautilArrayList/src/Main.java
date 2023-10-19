public class Main {
    public static void main(String[] args) {

        MyList<Integer> listArray= new MyList<>();

        for (int i = 1; i < 11; i+=2) {
            listArray.add(i);
        }
        listArray.printArr();
    }
}