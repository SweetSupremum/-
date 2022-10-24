package work;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Сколько осталось до полуночи
 *
 * @author SweetSupremum
 * @since 16.10.2022
 */
public class BeforeNight {
    public Duration beforeMidNight() {
        return Duration.between(LocalTime.now(), LocalTime.MAX);
    }
}
