package course.part1;

import model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int arr[] = {5,3,9,1,7};
        int min = MinMaxFinder.findMin(arr);
        System.out.println("min = " + min);
        int max = MinMaxFinder.findMax(arr);
        System.out.println("max = " + max);
    }
}
