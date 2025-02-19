package model.compiler;

/**
 * Classe che identifica un indirizzo
 */
public class Address {

    private String street;

    private int number;
    private String zip;
    private String city;
    private String country;

    /**
     * Costruttore
     * @param street
     * @param number
     * @param zip
     * @param city
     * @param country
     */
    public Address(String street, int number, String zip, String city, String country) {
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
