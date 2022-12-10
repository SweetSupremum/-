import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class Airline {
    private String destination;
    private Integer flightNumber;
    private AirlineType airlineType;
    private LocalTime departureTime;
    private DayOfWeek[] dayOfWeeks;

    public Airline() {
    }

    public Airline(
            String destination,
            Integer flightNumber,
            AirlineType airlineType,
            LocalTime departureTime,
            DayOfWeek[] dayOfWeeks
    ) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airlineType = airlineType;
        this.departureTime = departureTime;
        this.dayOfWeeks = dayOfWeeks;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AirlineType getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(AirlineType airlineType) {
        this.airlineType = airlineType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDayOfWeeks(DayOfWeek[] dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public enum AirlineType {
        CHARTER, REGULAR
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", airlineType=" + airlineType +
                ", departureTime=" + departureTime +
                ", dayOfWeeks=" + Arrays.toString(dayOfWeeks) +
                '}';
    }
}
