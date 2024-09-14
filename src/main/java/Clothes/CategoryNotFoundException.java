/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clothes;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author DELL
 */
public class CategoryNotFoundException extends Exception{
    private List<Cloth> clothes;
    private double price;
    private Category cat;
    
    public CategoryNotFoundException(List<Cloth> clothes, double price, Category cat){
        super("No available items in the category and the price demanded.\n");
        this.clothes = clothes;
        this.price = price;
        this.cat = cat;
    }
    
    public List<Double> Recovery(){
        ListIterator<Cloth> iter = clothes.listIterator();
        List<Double> results = new ArrayList<>();
        while(iter.hasNext()){
            Cloth tocheck = iter.next();
            if(tocheck.getCategory() == cat){
                results.add(tocheck.getPrice());
            }
        }
            
        return results;
    }
}
