package Lab1.Task11;

import java.util.Objects;

public class Taxi {
    Driver driver;
    String carbrand;//private
    int platenumber;//private
    protected String colour;//private

    public Taxi(final String carbrand, final int platenumber, final String colour ){
        this.carbrand = carbrand;
        this.platenumber = platenumber;
        this.colour = colour;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Taxi taxi = (Taxi) o;

        if (platenumber != taxi.platenumber) return false;
        if (driver != null ? !driver.equals(taxi.driver) : taxi.driver != null) return false;
        return carbrand != null ? carbrand.equals(taxi.carbrand) : taxi.carbrand == null;
    }

    @Override
    public int hashCode() {
        int result = driver != null ? driver.hashCode() : 0;
        result = 12 * result + (carbrand != null ? carbrand.hashCode() : 0);
        result = 12 * result + platenumber;
        return result;
    }
}

