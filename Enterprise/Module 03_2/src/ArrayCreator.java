import java.util.Random;

public class ArrayCreator {

    private int[] array;

    public int[] createArray(int size) {
        Random random = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }


}
