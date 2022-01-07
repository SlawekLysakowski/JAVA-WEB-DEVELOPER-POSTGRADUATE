import java.util.HashMap;
import java.util.Map;

public class Ch02TwoSum {
    // given an array of integers, return indices of the two numbers such as they sum up to
    // specific target. You may assume each input will have exactly 1 solution
    // you cannot use same number twice.

    public static void main(String[] args) {

        int [] numbers = new int[] {3, 2, 7, 8 , 6, 5, 8};
        int target = 7;
        int[] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);


    }
    public static int [] getTwoSum(int [] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap <>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visitedNumbers.containsKey(delta)) {
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);

        }

return new int[] {5, 5};
    }
}
