package work;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Тестыыыыыыы
 *
 * @author SweetSupremum
 * @since 23.10.2022
 */
class QuickSortTest {
    private static SortAlgorithm quick;
    private static SortAlgorithm java;


    @BeforeAll
    static void beforeAll() {
        String[] strings = Stream.generate(() -> UUID.randomUUID().toString()).limit(1_000_000).toArray(String[]::new);
        String[] stringsCopy = Arrays.copyOf(strings, strings.length);
        quick = new QuickSort(strings);
        java = new JavaSort(stringsCopy);
    }

    @Test
    void javaSortEqualsQuickSort() {
        Assertions.assertArrayEquals(quick.sort(), java.sort());
    }

}