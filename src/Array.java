public class Array {
    private int[] items;
    private int count;

    private int max;
    public Array(int length) {
        items = new int[length];
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }
    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count + 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }

    public int max() {
        for (int i = 0; i < count; i++)
            if (max < items[i])
                max = items[i];
        return max;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i+1];

        count--;
    }

    public void reverse() {
        for (int i = 0, j = count - 1; i < j; i++, j--) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
        }
    }
}
