package work;

/**
 * Печатаем время
 *
 * @author SweetSupremum
 * @since 16.10.2022
 */
public class Time {
    private final DurationAsString time;

    public Time(DurationAsString time) {
        this.time = time;
    }

    public void print() {
        System.out.println(time.userFriendlyTime());
    }
}
