/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders.ShippingInfos;

/**
 *
 * @author DELL
 */
public class Shipping {
    private String name;
    private String phone;
    private Address location;

    public Shipping(String name, String phone, Address location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        return name+", "+phone+", has the following address: "+location.toString(); 
    }
}
