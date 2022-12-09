package lab1.Task11;

import java.util.Objects;

public class Driver {

    protected String name;//private
    boolean ready;//private

    public Driver(final String name, final Boolean ready){
        this.name = name;
        this.ready = ready;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Driver driver = (Driver) o;

        return name != null ? name.equals(driver.name) : driver.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

