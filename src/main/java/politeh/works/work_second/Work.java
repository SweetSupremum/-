package politeh.works.work_second;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * TODO: use live templates in IDEA and code style plugins and settings
 * Вторая лаба
 * Вот он ООП язык на статик методах
 * Я бы с радостью писал комменты на английском, но оставим это на лучшие времена
 *
 * @author SweetSupremum
 * @since 17.09.2022
 */
public class Work {

    public static void main(String[] args) {
        Arrays.stream(arrayFactorial(5)).forEach(System.out::println);
        Arrays.stream(basePowExponents(6, 3)).forEach(System.out::println);
        System.out.println("seriesTaylorExp(12,1) = " + seriesTaylorExp(12, 1));
    }

    /**
     * Первых сто чисел делится на три
     *
     * @author SweetSupremum
     * Копипаста из документации
     * кстати на английском
     * @apiNote <p>An equivalent sequence of increasing values can be produced
     * sequentially using a {@code for} loop as follows:
     * <pre>{@code
     *     for (int i = startInclusive; i < endExclusive ; i++) { ... }
     * }</pre>
     * @since 17.09.2022
     */
    public static void dividedIntoThree() {

        IntStream
                .range(1, 101)
                .boxed()
                .filter(e -> e % 3 == 0)
                .forEach(System.out::println);
    }

    /**
     * Второе задание
     *
     * @param K > 0 ох уж эта читаемость кода и pass by value
     * @param n > 0
     * @author SweetSupremum
     * @since 17.09.2022
     */
    public static void taskTwo(int n, final int K) {

        if (n < 0 && K < 0) {
            throw new IllegalStateException("Output nums must be positive");
        }

        IntStream
                .range(1, n + 1)
                .boxed()
                .filter(e -> e % K == 0)
                .forEach(System.out::println);

    }

    /**
     * TODO: Можно было написать коллектор, который ищет минимум и максимум или заюзать teeing из Java 12
     * TODO: Можно было заюзать sorted() у stream() и взять первый и последний, но мы алгоритмитеры
     * <p>
     * Второе задание
     *
     * @param input массив чисел
     * @author SweetSupremum
     * @since 17.09.2022
     */
    public static void minMaxArray(int[] input) {

        int min = input[0];
        int max = input[0];

        // борьба за наносекунды, а не foreach()

        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) min = input[i];
            if (input[i] > max) max = input[i];
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    /**
     * TODO: https://habr.com/ru/post/255761/ - к некст решениям алгоритмов
     * Написать метод, принимающий на вход натуральное число nи возвращающий
     * массив длины n элементы которого содержат факториалы чисел от 1 до n
     *
     * @param n натуральное число на вход
     * @return array массив факториалов до числа n
     */

    public static int[] arrayFactorial(int n) {

        int[] array = new int[n];
        array[0] = 1;

        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] * (i + 1);

        }
        return array;
    }


    /**
     * TODO: https://habr.com/ru/post/255761/ - к некст решениям алгоритмов
     * TODO: use Biginteger.class for call method pow (но это замороченно)
     * Написать метод, принимающий на вход вещественное число x и натуральное число
     * n, вовзращающий массив длины n, элементы которого содержат результат возведения числа
     * x в степень от одного до n
     *
     * @param n boundary exponent
     * @param x base
     *          можно учить по три слова в день
     * @return array x^n
     */

    public static double[] basePowExponents(int n, final double x) {

        double[] array = new double[n];
        array[0] = x;

        for (int i = 1; i < n; i++) {
            array[i] = Math.pow(x, i + 1);

        }
        return array;
    }

    /**
     * Возвращает разложение в ряд Тейлора для экспоненты
     */
    public static double seriesTaylorExp(int n, final double x) {

        double[] basePowExponents = basePowExponents(n, x);
        int[] factorials = arrayFactorial(n);

        double exp = 1.0;

        for (int i = 0; i < basePowExponents.length; i++) {
            exp += basePowExponents[i] / factorials[i];
        }

        return exp;
    }


}
