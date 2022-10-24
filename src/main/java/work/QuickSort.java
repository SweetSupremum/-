package work;

/**
 * Быстрая сортировка
 *
 * @author SweetSupremum
 * @since 22.10.2022
 */
public class QuickSort implements SortAlgorithm {
    private final String[] strings;

    public QuickSort(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String[] sort() {
        quickSort(0, strings.length - 1);
        return strings;
    }

    private void quickSort(int from, int to) {
        if (from < to) {
            int divideIndex = partition(from, to);
            quickSort(from, divideIndex - 1);
            quickSort(divideIndex, to);
        }
    }

    private int partition(int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        String pivot = strings[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (strings[leftIndex].compareTo(pivot) < 0) {
                leftIndex++;
            }

            while (strings[rightIndex].compareTo(pivot) > 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(strings, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private void swap(String[] strings, int index1, int index2) {
        String tmp = strings[index1];
        strings[index1] = strings[index2];
        strings[index2] = tmp;
    }
}
