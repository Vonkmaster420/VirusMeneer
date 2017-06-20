package epid;

public class Epid {

    public static void main(String[] args) {

        Wereld wereld = new Wereld();   
        int a;
        wereld.spreadVirus(10);
        for (int i=0;i<20;i++){
            System.out.println("Turn : "+i);
            a=wereld.print();
            wereld.runTurn(4);
        }
        
        System.out.println("Conclusie");
        a=wereld.print();
        System.out.println("KLAAR");

        
        
        
        
    }
}