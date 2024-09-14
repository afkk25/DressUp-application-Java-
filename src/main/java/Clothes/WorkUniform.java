/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clothes;

/**
 *
 * @author DELL
 */
public class WorkUniform extends Cloth{
    private String job;
    private int dirt_lvl;
    private Review review; 

    public WorkUniform(String job, String title, String description, double price,Size size, Category cat, Color color) {
        super(title, description, price, size, cat, color);
        this.job = job;
    }
    
    public WorkUniform(String job, String title, String description, double price, String catStr) {
        super(title, description, price, catStr);
        this.job = job;
    }

    
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDirt_lvl() {
        return dirt_lvl;
    }

    public void setDirt_lvl(int dirt_lvl) {
        this.dirt_lvl = dirt_lvl;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
    
    @Override
    public String toString(){
        return super.toString()
               +"Job: "+job;
    }
}
