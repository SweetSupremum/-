package work;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * Я играю
 *
 * @author SweetSupremum
 * @since 23.10.2022
 */
@BenchmarkMode(Mode.All)
public class Play {

    @Benchmark
    public String[] randomUUID() {
        return Stream.generate(() -> UUID.randomUUID().toString()).limit(1_000_000)
                .toArray(String[]::new);
    }

    @Benchmark
    public String[] javaSort() {
        return new JavaSort(Stream.generate(() -> UUID.randomUUID().toString()).limit(1_000_000)
                .toArray(String[]::new))
                .sort();
    }

    @Benchmark
    public String[] quickSort() {
        return new QuickSort(Stream.generate(() -> UUID.randomUUID().toString()).limit(1_000_000)
                .toArray(String[]::new))
                .sort();
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Play.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();
    }
}
