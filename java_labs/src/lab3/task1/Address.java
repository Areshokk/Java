package lab3.task1;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private String house;
    private int flat;

    public Address(final String city, final String street, final String house, final int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public void showAddress(){
        System.out.println("Адреса: м." + this.city + " вул. " + this.street + " " + this.house + "/" + this.flat);
    }

    public String getCity() { return city; }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(final String house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(final int flat) {
        this.flat = flat;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Address address = (Address) o;
        return flat == address.flat && Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(house, address.house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house, flat);
    }



}
