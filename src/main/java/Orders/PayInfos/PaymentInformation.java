/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders.PayInfos;
import java.util.GregorianCalendar;

/**
 *
 * @author DELL
 */
public class PaymentInformation {
    private String holder_name;
    private GregorianCalendar expiration_date;
    private Type type;
    private int number;

    public PaymentInformation(String holder_name, GregorianCalendar expiration_date, Type type, int number) {
        this.holder_name = holder_name;
        this.expiration_date = expiration_date;
        this.type = type;
        this.number = number;
    }

    

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
      
    public Type getType(){
        return type;
    }
    
    public void setType(Type type){
        this.type = type;
    }
    
    public GregorianCalendar getExpiration_date(){
        return expiration_date;
    }
    
    public void setExpiration_date(GregorianCalendar expiration_date){
        this.expiration_date = expiration_date;
    }
    
      
    @Override
    public String toString(){
        return "\nHolder Name: "+holder_name+
               "\nNumber: "+number+
               "\nExpiration Date: "+ expiration_date.getTime()+
               "\nType: "+type; 
    }
}
