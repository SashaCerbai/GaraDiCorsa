/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

import java.util.ArrayList;

/**
 *
 * @author cerba
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Corridore.METRI=100;
        Corridore.SEGNA_ARRIVO=true;
        Corridore.FREQUENZA_STAMPA=1;
        
        ArrayList<Corridore> listaCorridori= new ArrayList<>();
        int nCorridori=4;
        
        for (int i = 0; i < nCorridori; i++) {
            
            listaCorridori.add(new Corridore("SHEEESH[" + (i+1) + "]"));
        }
        
        for(Corridore c: listaCorridori)
            c.start();
        for(Corridore c: listaCorridori)
            try{c.join();} catch(Exception e){}
        
        Corridore.stampaClassifica();
    }
    
}
