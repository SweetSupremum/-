package work;

import java.util.Arrays;

/**
 * сплитераааторы и fork join
 *
 * @author SweetSupremum
 * @since 23.10.2022
 */
public class JavaSort implements SortAlgorithm {
    private final String[] strings;

    public JavaSort(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String[] sort() {
        Arrays.sort(strings);
        return strings;
    }
}
