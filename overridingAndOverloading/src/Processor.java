import java.util.Arrays;

public class Processor {
    public void process(int i, int j) {
        System.out.printf("Processing two integers : %d, %d", i, j);
    }
    public void process(int[] integers) {
        System.out.println("Adding integer array : " + Arrays.toString(integers));
    }
    public void process(Object[] objects) {
        System.out.println("Adding integer array : " + Arrays.toString(objects));
    }
}

