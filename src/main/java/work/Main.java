package work;

/**
 * Третья лаба бенчмааааркииии
 *
 * @author SweetSupremum
 * @since 16.10.2022
 */
public class Main {
    private static final String USER_FRIENDLY_PATTERN = "Осталось до полуночи %d часа(ов) %d минут %d секунд";

    public static void main(String[] args) {
        new Time(new DurationAsString(new BeforeNight(), USER_FRIENDLY_PATTERN)).print();
    }

}
