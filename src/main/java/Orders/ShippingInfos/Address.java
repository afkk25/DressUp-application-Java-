/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders.ShippingInfos;

/**
 *
 * @author DELL
 */
public class Address {
    private int street_num;
    private String street;
    private String city;
    private String country;
    private int zipcode;

    public Address(int street_num, String street, String city, String country, int zipcode) {
        this.street_num = street_num;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

  
    /**
     * @return the street_num
     */
    public int getStreet_num() {
        return street_num;
    }

    /**
     * @param street_num the street_num to set
     */
    public void setStreet_num(int street_num) {
        this.street_num = street_num;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the zipcode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString () {
        return street_num+", "+street+ ", "+city+ ", "+zipcode+ ", "+country;
    }

    
    
}
