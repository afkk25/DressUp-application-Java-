/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clothes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
/**
 *
 * @author DELL
 */
public class ClothCollection {
    private  List<Cloth> clothes;
    private static final String path="data/dressup.ser";
    
    public ClothCollection(){
        this.clothes = new ArrayList<>();
    }
    
    public boolean addCloth(Cloth item){
        if(!clothes.contains(item)){
            clothes.add(item);
            return true;
        }
        return false;
    }
    
    public boolean removeCloth(String toRemove){
         ListIterator<Cloth> iter = clothes.listIterator();
        while (iter.hasNext()) {
            Cloth cloth = iter.next();
            if (cloth.getTitle().equalsIgnoreCase(toRemove)){
                clothes.remove(cloth);
                return true;
            }
        }
        return false;
    }
    
    
    public List<Cloth> searchCloth(double price, Category cat) throws CategoryNotFoundException{
        ListIterator<Cloth> iter = clothes.listIterator();
        List<Cloth> results = new ArrayList<>();

        while (iter.hasNext()) {
            Cloth item = iter.next();
            if (item.getPrice() <= price && item.getCategory()==cat) {
                results.add(item);
            }
        }
        if(results.isEmpty())
            throw new CategoryNotFoundException(clothes, price, cat);
        
        return results;
    }
    
    public boolean modifyCloth(String toModify, Cloth new_Item){ //it shoudl return boolean ?
        ListIterator<Cloth> iter = clothes.listIterator();
        while (iter.hasNext()) {
            Cloth cloth = iter.next();
            if (cloth.getTitle().equalsIgnoreCase(toModify)){
                iter.set(new_Item);
                return true;
            }
        }
        return false;
    }
    
    public void sortClothes(){ //Sort in ascending order
        Collections.sort(clothes);
    }
    
    @Override
    public String toString() {
        String str = "";
        ListIterator<Cloth> iter = clothes.listIterator();
        while (iter.hasNext()) {
            Cloth item = iter.next();
            if(item instanceof WorkUniform){
                WorkUniform it = (WorkUniform) item;
                str += it.toString();
                //System.out.println("WorkUnifrom\n"+it.toString()+"\n");
            }else{
                str += item.toString();
                //System.out.println("cloth\n"+item.toString()+"\n");
            }
            str += "\n";
        }

        return str;
    }
    
    
    public void load() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        clothes = (List<Cloth>) ois.readObject();
        
        ois.close();
        fis.close();
        

    }
    
     public void save() throws FileNotFoundException, IOException {
       
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutput oos = new ObjectOutputStream(fos);
        oos.writeObject(clothes);

        oos.close();
        fos.close();

    }
     
     

}
