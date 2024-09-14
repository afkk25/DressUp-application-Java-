/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clothes;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Cloth implements Serializable, Comparable<Cloth>{
    private String title;
    private String description;
    private double price;
    private Size size;
    private Category cat; 
    private Color color;
    private static final long serialVersionUID = 1L;
    
    public Cloth(String title, String description, double price, String catStr) {
        this.title = title;
        this.description = description;
        this.price = price;
        setCategory(catStr);
    }

    public Cloth(String title, String description, double price, Size size, Category cat, Color color) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.size = size;
        this.cat = cat;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Category getCategory() {
        return cat;
    }

    public void setCategory(String cat) {
        this.cat = Category.valueOf(cat.toUpperCase());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public boolean equals(Object obj){
        return (obj != null && (obj instanceof Cloth) && ((Cloth)obj).getTitle().equals(this.title));
    }
    
    @Override
    public int compareTo(Cloth item) {
        return (this.title.compareToIgnoreCase(item.getTitle()));
    }
    
    @Override
    public String toString(){
        return "Title: "+title+
               "\nDescription: "+description+
               "\nPrice: "+price+"\nCategory: "+cat.name();
    }
}
