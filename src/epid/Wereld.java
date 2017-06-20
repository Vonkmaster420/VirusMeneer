package epid;

import java.util.Random;

public class Wereld {
    
    Virus virusA;
    Persoon[] personen;
    int numPersonen;
    
    public Wereld(){
        int percVaccinated = 15;
        numPersonen = 10000;
        virusA = new epid.Virus(50, 50, 50);
        personen = new Persoon[numPersonen];
        
        for(int i=0; i<(numPersonen); i++){
              personen[i]=new Persoon(percVaccinated);
    
        }

    }
    
    public int print(){
        int statusA=0;
        int statusB=0;
        int statusC=0;
        for(int i=0; i<(numPersonen); i++){
            if (personen[i].getStatus() == 0) {
                statusA++;
            } else if (personen[i].getStatus() == 1) {
                statusB++;
            } else {
                statusC++;
            }
            
         }   
        
        
        System.out.println("Status S : "+statusA);
        System.out.println("Status I : "+statusB);
        System.out.println("Status R : "+statusC);
        
        return 0;
        
    }
    
    
    public void spreadVirus(int numInfected){
        Random randomGenerator = new Random();
        int randomGetal;
        for (int i=0; i<numInfected;i++){
            randomGetal = randomGenerator.nextInt(numPersonen);
            if (personen[randomGetal].getStatus()==2){
                //doe niets; persoon is reeds resistent
            } else {
                personen[randomGetal].setStatus(1);
            }
            
        }

        
    }
    
    
    public void runTurn(int numContacts){
        
        for (int i=0;i<numPersonen;i++){
            if (personen[i].getStatus()==1){
                personen[i].resistentiecounter++;
                if (personen[i].resistentiecounter==3){
                    personen[i].setStatus(2);
                }
            }
        }
        
        
        for (int j=0;j<numPersonen;j++){
            if (personen[j].getStatus()==1){
                spreadVirus(numContacts);
            }
        }
        
        
    }
    
    public void probleemCode(){
                Persoon[] Personen = new Persoon[numPersonen];
                Random randomGenerator = new Random();
                int randomInt;
                for(int j=0;j<(numPersonen); j++){
                    
                    randomInt = randomGenerator.nextInt(100);
                    if(randomInt < 30) {
                        if ((Personen[j].Statuss).equals("I")){
                            Personen[j].Statuss="R";
                        }
                    }  
               
                 }
    }
    
    
}
