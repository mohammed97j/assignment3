/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_p2;

/**
 *
 * @author GeNDii
 */
public  class mammal implements animal {
public int no_oflegs;
public String fav_food;

    public mammal(int no_oflegs, String fav_food) {
        this.no_oflegs = no_oflegs;
        this.fav_food = fav_food;
    }

   

 

    public int getNo_oflegs() {
        return no_oflegs;
    }

    public String getFav_food() {
        return fav_food;
    }
        

      
    @Override
    public void eat() {
    }

    @Override
    public void travel() {
    }



  

    

   
   


    
    
}
