public class MostFrequentNumber {
    public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10];
        int mostFrequent = 0;
        int nbrOfOccurrence = 0;

        for (int i = 0; i < array.length; i++) {
            counters[array[i]]++;
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > nbrOfOccurrence) {
                nbrOfOccurrence = counters[i];
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] == nbrOfOccurrence) {
               mostFrequent = i;
            }
        }


        System.out.print("The most frequent number is " + mostFrequent + ". It appeared " + nbrOfOccurrence + " times");













    }
}
