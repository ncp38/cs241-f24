import java.util.Arrays;

public class sortingTest
{
    public static void main(String[] args)
    {
        int[] array1 = {11, 7, 9, 22, 500, 6, 1, 0, 1111, -2};
        mergesort.mergesort(array1);
        int[] array2 = {11, 7, 9, 22, 500, 6, 1, 0, 1111, -2};
        quicksort.quickSort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
