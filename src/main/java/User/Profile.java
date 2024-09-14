/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import Orders.ShippingInfos.Address;
/**
 *
 * @author DELL
 */
public class Profile {
    private String name;
    private Address add; 
    private String phone;

    public Profile(String name, Address add, String phone) {
        this.name = name;
        this.add = add;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        return "Name: "+name+
               "\nAddress: "+add.toString()+
               "\nPhone: "+phone;
    }
    
}
