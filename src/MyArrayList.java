public class MyArrayList<T> implements MyList{
    private T[] arr;
    private int size;
    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public void add(Object item) {
        if (arr.length == size){
            T[] newArr = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = (T) item;
    }
    @Override
    public Object get(int index) {
        return true;
    }
    @Override
    public Object remove(int index) {
        return true;
    }
    @Override
    public boolean contains(Object o) {
       return true;
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}