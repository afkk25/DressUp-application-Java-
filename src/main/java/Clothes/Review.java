/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clothes;
import java.util.GregorianCalendar;
import User.Account;
/**
 *
 * @author DELL
 */
public class Review {
    private String comment;
    private GregorianCalendar date;
    private Account user;
    private Stars rating;

    public Review(String comment, GregorianCalendar date, Account user, Stars rating) {
        this.comment = comment;
        this.date = date;
        this.user = user;
        this.rating = rating;
    }

    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public Stars getRating() {
        return rating;
    }

    public void setRating(Stars rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString(){
        return "\nUser: "+user.toString()+
               "\nComment: "+comment+
               "\nDate: "+date.getTime()+
               "\nRating: "+rating.name().toLowerCase();
    }
}
