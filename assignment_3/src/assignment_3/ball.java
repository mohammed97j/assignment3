/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

/**
 *
 * @author GeNDii
 */
public  abstract class ball implements tossable {
    
private String brand_name;
public ball(String brand_name){

}
 
public String getbrand_name(){
    return brand_name;
}

public abstract void bounce();

    @Override
    public void toss() {
    }

}
