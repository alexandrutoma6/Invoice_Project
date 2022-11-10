package ro.alex;

import java.util.Scanner;

public class Address {
    String country;
    String city;
    String county;
    String street;
    int number;
    int postCode;

    public Address(String country, String city, String county, String street, int number, int postCode) {
        this.country = country;
        this.city = city;
        this.county = county;
        this.street = street;
        this.number = number;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        String address = "Strada " + street + ", numar: "+number+", cod postal: "+postCode +"\n" + city + " " + county + " " + country;
        return address;
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

        Address returnAddress = new Address(country,city,county,street,number,postCode);
        return returnAddress;
    }

}
