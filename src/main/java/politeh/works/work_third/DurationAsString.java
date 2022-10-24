package politeh.works.work_third;

import java.time.Duration;

/**
 * форматирует Duration в UserFriendly строку
 *
 * @author SweetSupremum
 * @since 16.10.2022
 */
public class DurationAsString {
    private final BeforeNight beforeNight;
    private final String pattern;

    public DurationAsString(BeforeNight beforeNight, String pattern) {
        this.beforeNight = beforeNight;
        this.pattern = pattern;
    }

    public String userFriendlyTime() {
        Duration duration = beforeNight.beforeMidNight();
        return String
                .format(pattern,
                        duration.toHoursPart(),
                        duration.toMinutesPart(),
                        duration.toSecondsPart());
    }
}
