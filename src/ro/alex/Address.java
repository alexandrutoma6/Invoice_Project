package ro.alex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

record AddressR(
        String country,
        String city
) {
}

public class Address {
    private final String country;
    private final String city;
    private final String county;
    private final String street;
    private final int number;
    private final int postCode;

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public Address(String country, String city, String county, String street, int number, int postCode) {
        this.country = country;
        this.city = city;
        this.county = county;
        this.street = street;
        this.number = number;
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number
                && postCode == address.postCode
                && Objects.equals(country, address.country)
                && Objects.equals(city, address.city)
                && Objects.equals(county, address.county)
                && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, county, street, number, postCode);
    }

    @Override
    public String toString() {
        String address = "Strada " + street + ", numar: " + number + ", cod postal: " + postCode + "\n" + city + " " + county + " " + country;
        return address;
    }

    public static void main(String[] args) {
        Set<Address> setOfAdr = new HashSet<>();
        Address romania = new Address("romania", null, null, null, 11, 2);
        setOfAdr.add(romania);
//        System.out.println(romania.hashCode());
        System.out.println(setOfAdr.contains(romania));
        Address romania2 = new Address("romania", null, null, null, 11, 2);
        System.out.println(setOfAdr.contains(romania2));
//        System.out.println(romania2.hashCode());
//        System.out.println(romania.equals(romania));
//        System.out.println(romania.equals(romania2));

    }

    public static Address createAddress() {
        Scanner read = new Scanner(System.in);
        System.out.print("Country = ");
        String country = read.next();
        System.out.print("County = ");
        String county = read.next();
        System.out.print("City = ");
        String city = read.next();
        System.out.print("Street = ");
        String street = read.next();
        System.out.print("Number = ");
        int number = read.nextInt();
        System.out.print("Post Code = ");
        int postCode = read.nextInt();

        Address returnAddress = new Address(country, city, county, street, number, postCode);
        return returnAddress;
    }

}
