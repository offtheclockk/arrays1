public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if array is full, resize it
        // add new item at the end of the array
        items[count++] = item;
    }
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
