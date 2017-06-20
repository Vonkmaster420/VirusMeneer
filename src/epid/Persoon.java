/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epid;

import java.util.Random;

/**
 *
 * @author wilger
 */
public class Persoon {
    
    
    int status;
    int resistentiecounter;
    public String Statuss;
    
    public Persoon(int percVaccinated){
        Random randomGenerator = new Random();
        int randomGetal  = randomGenerator.nextInt(99);
        if (randomGetal > (100-percVaccinated)){
            status = 2;
        } else {
            status = 0;
        }
        resistentiecounter = 0;
        
        
    }

    
    public void setStatus(int statusGetal){
        status = statusGetal;
    }
    
    public int getStatus(){
        return status;
    
    }
    
    public String print(){
        return "Persoon met status"+status;
    }
    
}