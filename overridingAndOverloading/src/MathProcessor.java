public class MathProcessor extends Processor {
    @Override
    public void process(int i, int j) {
        System.out.println("Sum of the integers is : " + (i + j));
    }
    @Override
    public void process(int[] integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        System.out.println("Sum of the integer array elements is : " + sum);
    }
}
