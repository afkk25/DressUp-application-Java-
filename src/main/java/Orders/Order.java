/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders;
import java.util.GregorianCalendar;
import User.Account;
import Orders.PayInfos.PaymentInformation;
import Orders.ShippingInfos.Shipping;
/**
 *
 * @author DELL
 */
public class Order {
    private int order_number;
    private GregorianCalendar date_placed;
    private Account Customer;
    private PaymentInformation payment;
    private Shipping address;

    public Order(int order_number, GregorianCalendar date_placed, Account Customer, PaymentInformation payment, Shipping address) {
        this.order_number = order_number;
        this.date_placed = date_placed;
        this.Customer = Customer;
        this.payment = payment;
        this.address = address;
    }
    
    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public GregorianCalendar getDate_placed() {
        return date_placed;
    }

    public void setDate_placed(GregorianCalendar date_placed) {
        this.date_placed = date_placed;
    }

    public Account getCustomer() {
        return Customer;
    }

    public void setCustomer(Account Customer) {
        this.Customer = Customer;
    }

    public PaymentInformation getPayment() {
        return payment;
    }

    public void setPayment(PaymentInformation payment) {
        this.payment = payment;
    }

    public Shipping getAddress() {
        return address;
    }

    public void setAddress(Shipping address) {
        this.address = address;
    }
    
    
    public String ToString(){
        return "Order number: "+order_number+
               "Date placed: "+date_placed.getTime()+
               "Customer: "+Customer.toString(); //Payment and Shipping Info should not be printed (Sensitive Info)
              
    }
}
