import java.time.DayOfWeek;
import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {
        Airline airline = new Airline();
        airline.setAirlineType(Airline.AirlineType.CHARTER);
        airline.setDayOfWeeks(DayOfWeek.values());
        airline.setFlightNumber(10);
        airline.setDepartureTime(LocalTime.now());
        airline.setDestination("Destination");
        System.out.println(airline);
    }

    private static int getArraySizeFour(String[][] strings) throws WrongArrayDataException {
        int parentLength = strings.length;
        String parentSize = String.valueOf(parentLength);
        if (parentLength != 4) throw new UnsupportedArraySizeException("parent length equals " + parentLength);
        for (int i = 0; i < parentLength; i++) {
            int childLength = strings[i].length;
            if (childLength != 4) {
                throw new UnsupportedArraySizeException("child length for index " + i + " equals " + childLength);
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new WrongArrayDataException("for " + i + " * " + j + " wrong data");
                }
            }
        }
        return sum;
    }

}
