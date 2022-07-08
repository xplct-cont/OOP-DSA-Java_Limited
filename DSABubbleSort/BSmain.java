import java.util.Arrays;

public class BSmain {
    public static void main(String[] args) {
        int[] numbers = {7,5,3,5,6,1,2,8};
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
