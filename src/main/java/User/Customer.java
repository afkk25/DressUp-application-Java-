/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
/*
 *
 * @author DELL
 */
public class Customer {
    private Profile profile;

    public Customer(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
    @Override
    public String toString(){
        return "\nProfile: "+profile.toString();
    }
}
