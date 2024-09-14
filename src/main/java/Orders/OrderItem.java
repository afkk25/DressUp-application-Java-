/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orders;
import Clothes.Cloth;
import Clothes.Color;
import Clothes.Size;

/**
 *
 * @author DELL
 */
public class OrderItem {
    private Cloth clothItem;
    private int qty;
    private Size size;
    private Color color;

    public OrderItem(Cloth clothItem, int qty, Size size, Color color) {
        this.clothItem = clothItem;
        this.qty = qty;
        this.size = size;
        this.color = color;
    }

    public Cloth getClothItem() {
        return clothItem;
    }

    public void setClothItem(Cloth clothItem) {
        this.clothItem = clothItem;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "\nCloth: "+clothItem.toString()+
               "\nQuantity: "+qty+
               "\nColor: "+color+
               "\nSize: "+size;
    }
}
